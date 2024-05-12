package com.yx.xx.transaction.controller;

import cn.hutool.core.lang.UUID;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UploadController {

    private static final String ENDPOINT = "oss-cn-beijing.aliyuncs.com";
    private static final String ACCESS_KEY_ID = "LTAI5tHBDerC37r3fURyDbbB";
    private static final String ACCESS_KEY_SECRET = "7jfwKVBjzcPqQ4kGurFLBYoC6BhGKg";
    private static final String BUCKET_NAME = "yangxin0215";

    @PostMapping("upload")
    @ResponseBody
    public Map<String,Object> upload(MultipartFile dropzFile, HttpServletRequest request) {
        Map<String,Object> result = new HashMap<>();

        //文件名
        String fileName = dropzFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        String newName = UUID.randomUUID() + "." + suffix;
        OSS client = new OSSClientBuilder().build(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        try {
            client.putObject(new PutObjectRequest(BUCKET_NAME, newName, new ByteArrayInputStream(dropzFile.getBytes())));
            // 上传文件路径 = http://BUCKET_NAME.ENDPOINT/自定义路径/fileName
            String filePath = "http://" + BUCKET_NAME + "." + ENDPOINT + "/"+ newName;
            result.put("filePath", filePath);
            System.out.println("上传成功，文件路径为：" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            client.shutdown();
        }
        return result;
    }
}
