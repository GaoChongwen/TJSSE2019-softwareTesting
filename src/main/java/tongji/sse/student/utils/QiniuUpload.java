package tongji.sse.student.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

public class QiniuUpload {

    public static void uploadBytes(byte[] uploadBytes, String key) throws UnsupportedEncodingException {
        Configuration cfg = new Configuration(Zone.zone0());

        UploadManager uploadManager = new UploadManager(cfg);
        //上传凭证
        String accessKey = "KF6PihRRy0DzTXD-NuPIa3n-01H3sCFV-62a8OP_";
        String secretKey = "x_BM5vlkvHqLJ5eqRhuphh4p0THKKrb5i0w23K8n";
        String bucket = "temp";

        //默认不指定key的情况下，以文件内容的hash值作为文件名
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        System.out.println("Encoder start: ");
        System.out.println(URLEncoder.encode(key, "utf-8"));

        try{
            Response response = uploadManager.put(uploadBytes, key, upToken);
            // 解析上传结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println("putRet.key:");
            System.out.println(putRet.key);
            System.out.println("putRet.hash:");
            System.out.println(putRet.hash);
            System.out.println("reponse get");

        }catch (QiniuException ex){
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
    }
}
