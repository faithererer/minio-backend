package com.zjc.backend.utils;

import com.zjc.backend.config.MinioConfig;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
public class FileUt {

    @Value(value = "${minio.bucket}")
    private String bucket;

    @Value(value = "${minio.host}")
    private String host;

    @Value(value = "${minio.url}")
    private String url;

    @Value(value = "${minio.access-key}")
    private String accessKey;

    @Value(value = "${minio.secret-key}")
    private String secretKey;

    @GetMapping("/6")
    public String getUrl(String filename) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

//        MinioClient minioClient = MinioClient.builder()
//                .endpoint(host)
//                .credentials(accessKey, secretKey)
//                .build();
//
//        boolean found =
//                minioClient.bucketExists(BucketExistsArgs.builder().bucket("zjc").build());
//        if (!found) {
//            // Make a new bucket called 'zjc'.
//            minioClient.makeBucket(MakeBucketArgs.builder().bucket("zjc").build());
//        } else {
//            System.out.println("Bucket 'zjc' already exists.");
//        }
//
//        minioClient.uploadObject(
//                UploadObjectArgs.builder()
//                        .bucket("zjc")
//                        .object("zjc-2015.jpeg")
//                        .filename("F:\\a\\5036\\game\\game\\HEN\\MEIMEIBEIFUSHEN\\【手机扫码进入】.png")
//                        .build());

        return "ok76";
    }

}
