package tongji.sse.student.controller;


import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import tongji.sse.student.domain.Experience;
import tongji.sse.student.service.BCService;
import tongji.sse.student.service.FileService;
import tongji.sse.student.service.UserService;
import tongji.sse.student.utils.QiniuUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tongji.sse.student.utils.*;

@Controller
@Component
public class FileController {
    @Autowired
    private FileService fileService;
    @Autowired
    private BCService bcService;
    @Autowired
    private UserService userService;

    @RequestMapping("recordFileUpload")
    @ResponseBody
//    @ExceptionHandler
    String uploadFile(@RequestParam("files") MultipartFile  file, HttpServletRequest request) throws IOException, ServletException {

//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, OPTIONS");
//        String method = request.getMethod();
//        if ("OPTIONS".equals(method)) {
//            return "";
//        }

        String pattern = "\\d+";
        Pattern p = Pattern.compile(pattern);
        String originalFileName = file.getOriginalFilename();

        Matcher m = p.matcher(originalFileName);
        if (!m.find()) {
            return "error";
        }
        String id = m.group(0);
        Integer userId = Integer.parseInt(id);
        System.out.println(m.group(0));
        String description = request.getParameter("description");
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String month = request.getParameter("month");
        System.out.println("userId:"+userId);
        System.out.println(file);


            //to calculate the md5
            Hash hash = new Hash();
            String hashMd5 = "";
            if (!file.isEmpty()) {
                File f= new File("ff");
                byte [] buffer = file.getBytes();
                OutputStream outputStream = new FileOutputStream(f);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                bufferedOutputStream.write(buffer);
                hashMd5 = Hash.getFileMD5(f);
                System.out.println(hashMd5);
            }

            if(file!=null&&!file.isEmpty()){
                System.out.println("Start uploading files");
                String url = qiniuUpload(file, userId, originalFileName);
                writeToDB(userId,description,name, url,type);
//                try {
//                    if (!BCService.inited) {
//                        BCService.initServer();
//                    }
//                    BCService.addRecord(userId, hashMd5, originalFileName, "2018", month);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    return "error";
//                }
                return "ok";

            }

        return "OK";
    }


    @RequestMapping("verifyFile")
    @ResponseBody
    String verifyFile(@RequestParam("files") MultipartFile  file, HttpServletRequest request) throws IOException {
        String hashMd5 = "";
        Integer id = 0;
        if (!file.isEmpty()) {
            File f= new File("ff");
            byte [] buffer = file.getBytes();
            OutputStream outputStream = new FileOutputStream(f);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            bufferedOutputStream.write(buffer);
            hashMd5 = Hash.getFileMD5(f);
            String pattern = "([0-9]*)";
            Pattern p = Pattern.compile(pattern);
            String originalFileName = file.getOriginalFilename();

            Matcher m = p.matcher(originalFileName);
            if (!m.find()) {
                return "error";
            }
            System.out.println(m.group(0));
            System.out.println(hashMd5);
            id = Integer.parseInt(m.group(0));
        }

        if(file!=null&&!file.isEmpty()){
            System.out.println("Start check files");
            try {
                if (!BCService.inited) {
                    BCService.initServer();
                }
                if (BCService.verify(id, hashMd5).getValue()) {
                    return "OK";
                } else {
                    return "Wrong";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "error";
            }

        }
        return "fail";
    }



    private String qiniuUpload(MultipartFile file, Integer userId, String fileName) throws IOException {
        byte[] uploadBytes = file.getBytes();
        String key = userId + "_" + fileName;
        String domain = "psj044fnx.bkt.clouddn.com/";
        String url=domain+key+ "?attname=";
        System.out.println(url);
        QiniuUpload.uploadBytes(uploadBytes, key);
        //TODO:update DB here
        return url;
//        updateDB(userId, fileName, info, url);

    }


    private void writeToDB(Integer userId, String description,String name,  String fileName, String type)  {
        userId = 4;
        Integer id = fileService.generationExpId();
        Experience experience = new Experience(id,userId, name,description,fileName,0, type);

        if (fileService.insertExp(experience) ) {
            System.out.println("Successfully inserted");
        } else {
            System.out.println("Fail to insert");
        }

    }


    @RequestMapping("getRecords")
    @ResponseBody
    ArrayList<Experience> getAllEx() {
        return fileService.getAllExperience();
    }


    @RequestMapping("getUserRecords")
    @ResponseBody
    ArrayList<Experience> getUserEx(HttpServletRequest request) {
        String userId = request.getParameter("id");
        userId = "4";
        return fileService.getUserExperience(Integer.parseInt(userId));
    }

    @RequestMapping("review")
    @ResponseBody

    String reviewFile(@Param("fileId") Integer fileId, @Param("status") Integer status) {
        System.out.println("fileId:" + fileId);
        System.out.println("status:"+status);
        if (fileService.review( fileId, status)) {

            return "OK";
        } else {
            return "Error";
        }
    }


    @RequestMapping(value = "/showCV", method = RequestMethod.GET)
    public ResponseEntity<byte[]> pdfDownload(
            HttpServletRequest httpServletRequest
    ) throws IOException
    {
        String path = "/Users/LYC/Desktop/2018Fall/StudentInfo/Student/src/main/resources/static/20184-阿圆-简历.pdf";
        File file = new File(path);
        HttpHeaders httpHeaders = new HttpHeaders();
        String fileName = file.getName();
        httpHeaders.setContentDispositionFormData("attachment",            java.net.URLEncoder.encode(fileName,"UTF-8"));
        httpHeaders.setContentType(MediaType.parseMediaType("application/pdf"));
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                httpHeaders,
                HttpStatus.CREATED);
    }

}
