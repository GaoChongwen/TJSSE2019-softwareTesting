package tongji.sse.student.controller;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tongji.sse.student.domain.*;
import tongji.sse.student.service.CourseService;
import tongji.sse.student.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@Component
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    CourseService courseService;

    @RequestMapping("/log")
//    @ResponseBody
    String log() {
        return "School_Manage";
    }


    @RequestMapping("getUser")
    @ResponseBody
    User getUser(@RequestParam("id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("abc");
        String test = "aaaa";
        return user;
    }

    @RequestMapping("/login")
    @ResponseBody
    Integer login(@RequestParam("id") Integer id, @RequestParam("password") String password, @RequestParam("role") Integer role, HttpServletRequest request) {
        User user = new User();
        user.setId(id);
        user.setPassword(password);
        user.setUserType(role);
        User currentUser = userService.getUserByType(user);
        if (userService.varifyUser(user, currentUser)) {
            System.out.println("OK");
            HttpSession session = request.getSession(false);
            if (session!=null && session.getAttribute("id") != null) {
                System.out.println("Already login");
                System.out.println(session.getId());
                return currentUser.getUserType();
            } else {
                session = request.getSession();
                session.setAttribute("id", currentUser.getId());
                System.out.println(session.getAttribute("id"));
                System.out.println(session.getId());
//                session.setAttribute("role", currentUser.getUserType());
                return currentUser.getUserType();
            }

        } else {
            return -1;
        }
    }

    Integer registerUser(String name, String password, String phone, Integer userType,  Integer instituteId) {
        if (name == null || name.equals("") || password==null || password.equals("") || userType == null || instituteId==null ) {
            return -1;
        }
        User user = new User(userService.generateId(), phone,name,password,"",userType, "",instituteId);
        try {
            userService.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return user.getId();
    }

//    @RequestMapping("/getUserType")
//    @ResponseBody
//    Integer getUserType(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        if (session==null) {
//            System.out.println("Please Login");
//            return -1;
//        } else {
//            String userId = session.getAttribute("id").toString();
//            if(userId == null || userId.equals(null)) {
//                return -1;
//            } else {
//
//                return
//            }
//        }
//    }


    @RequestMapping("createStudent")
    @ResponseBody
    String createStudent(HttpServletRequest request) {

        HttpSession session= request.getSession(false);
        System.out.println("in");
        System.out.println(session);
        System.out.println(session.getId());
        System.out.println(session.getAttribute("id"));
        return "ok";

    }


    // TODO: Confirm the parameter to create a student object
    @RequestMapping("registerStudent")
    @ResponseBody
//    @ExceptionHandler
    void registerStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String studentName = request.getParameter("studentName");
        String bloodType = request.getParameter("bloodType");
        String currentAddress = request.getParameter("currentAddress");
        String majorId = request.getParameter("majorId");
        String nationality = request.getParameter("nationality");
        String permanentAddress = request.getParameter("permanentAddress");
        String province = request.getParameter("province");
        String recuitType = request.getParameter("recruitType");
        String rollinYear = request.getParameter("rollinYear");
        String gender = request.getParameter("gender");
        String identityNumber  = request.getParameter("identityNumber");
        String collegeId = request.getParameter("collegeId");
        String studentStatus = request.getParameter("studentType");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String fatherPhone = request.getParameter("fatherPhone");
        String motherPhone = request.getParameter("motherPhone");
        String phone = request.getParameter("phone");
        // get teacher id
//        HttpSession session = request.getSession(false);
//        String id = session.getAttribute("id").toString();
//        Integer teacherId = Integer.parseInt(id);
        Integer teacherId = 1;
        // create a student object and create parent object later
        // here we should check the key info is not null
        if (majorId == null || majorId.equals("")
        || collegeId == null || collegeId.equals("")
        || studentName == null || studentName.equals("")
        || identityNumber == null || identityNumber.equals("")) {
            response.sendError(400, "make sure fill all the key information");
            return;
        }

        Integer instituteId = userService.getInstituteId(teacherId);


        Integer userId = registerUser(studentName,"123", phone, 0, instituteId);
        Student student = new Student(userId,rollinYear+String.valueOf(userId),Integer.parseInt(gender),18,studentStatus,nationality,bloodType,
                province,"",0.0,"",nationality,recuitType,Integer.parseInt(rollinYear),identityNumber,permanentAddress,currentAddress,Integer.parseInt(collegeId));

        try {
            userService.registerStudent(student);


        } catch (Exception e) {
            response.sendError(400, "create student fail, check your parameter");
        }

    }

    @RequestMapping("registerCompany")
    @ResponseBody
//    @ExceptionHandler
    void registerCompany(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String companyName = request.getParameter("companyName");
        String baseId = request.getParameter("baseId");
        String contactName = request.getParameter("contactName");
        String contactPhone = request.getParameter("contactPhone");
        String companyPhone = request.getParameter("companyPhone");
        String companyAddress = request.getParameter("companyAddress");
        String coorperationEndTime = request.getParameter("cooperationEndYear");
        String description = request.getParameter("description");

        // To check the crucial detail is not null
        if (companyName == null || companyName.equals("")
        || companyPhone == null || companyPhone.equals("")
        || baseId == null || baseId.equals("")) {
            response.sendError(400, "Missing crucial information");
        }
        Integer instituteId = 1;
        Institute institute = new Institute(instituteId,companyName,companyAddress,"",companyPhone);
        instituteId = userService.createInstitude(institute);
        Integer userId = registerUser(contactName,"123456",contactPhone,3,instituteId);
        if (userId == -1) {
            response.sendError(400, "user exited");
            return;
        }

        Company company = new Company(description,userId,baseId);
        try {
            userService.registerCompany(company);
        } catch (Exception e) {
            response.sendError(400, "can't register company!");
        }


//        User user = new User(userService.generateId(), contactPhone, companyName, "123456", "", 3, )


//
    }


    @RequestMapping("registerTeacher")
    @ResponseBody
//    @ExceptionHandler
    String registerTeacher(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Integer adminId = 1;
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String ID = request.getParameter("ID");
        String title = request.getParameter("title");
        String nationality =  request.getParameter("nationality");
        String phone = request.getParameter("phone");
        String majorId = request.getParameter("majorId");
        String collegeId = request.getParameter("collegeId");
        String currentAddress = request.getParameter("currentAddress");
        String permanentAddress = request.getParameter("permanentAddress");
        String age = request.getParameter("age");
        Integer instituteId = userService.getInstituteId(adminId);

        if (name == null || name.equals("")
        ||phone == null || phone.equals("")) {
            response.sendError(400, "key information was missing");
            return "error";
        }
        User user = new User(userService.generateId(),phone,name,"123456","",1,"",instituteId);
        try {
            userService.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(400, "create user Fail");
            return "error";
        }

        Teacher teacher = new Teacher(user.getId(),Integer.parseInt(collegeId),user.getId(),Integer.parseInt(gender)
        ,age,ID,title);
        try {
            userService.registerTeacher(teacher);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(400,"Create Teacher Fail");
        }

        return "Ok";
    }


//    @RequestMapping()
    @RequestMapping(value = "courses")
    @ResponseBody
    ArrayList<Course> getStudentCourse() {
            Integer id = 4;
        ArrayList<Course> courses=courseService.getStudentCourses(id);
        for (Course course:courses) {
            UserStudyCourse userStudyCourse = new UserStudyCourse(id,course.getId(),-1.0);
            userStudyCourse = courseService.userStudyCourse(userStudyCourse);
            if (userStudyCourse == null) {
                return null;
            }
            course.setScore(userStudyCourse.getScore());
        }

        return courses;
    }

    @RequestMapping("markStudent")
    @ResponseBody
    String markStudent(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String studentId = request.getParameter("stuId");
        String courseId = request.getParameter("courseId");
        String score = request.getParameter("scores");
        System.out.println("stu:"+studentId);
        System.out.println("course:"+courseId);
        try {
            courseService.markStudent(Integer.parseInt(studentId), Integer.parseInt(courseId), Double.parseDouble(score));
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(401, "something wrong");
        }
        return "ok";
}
//    String markStudent(@RequestParam(value = "stuList[]")List<Map<String, Object>> stuList, @RequestParam("courseId") Integer courseId) {
//        System.out.println(stuList);
//        return "OK";
//    }

    @RequestMapping("indexData")
    @ResponseBody
    Map<String, Object> getIndexInfo(HttpRequest request, HttpResponse response) {
        return userService.getIndexNumber();
    }


    @RequestMapping(value = "/showPDF", method = RequestMethod.GET)
    public ResponseEntity<byte[]> pdfDownload(
            HttpServletRequest httpServletRequest
    ) throws IOException
    {
        String path = "/Users/LYC/Desktop/2018Fall/StudentInfo/Student/src/main/resources/static/20184-阿圆-成绩单.pdf";
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
