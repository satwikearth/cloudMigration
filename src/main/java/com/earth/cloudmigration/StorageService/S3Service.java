package com.earth.cloudmigration.StorageService;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class S3Service {

    @Autowired
    AWSCredentials awsCredentials;

    @Autowired
    AmazonS3 amazonS3;

    public String createBucket(String bucketName) {
        // create bucket - name must be unique for all S3 users
        amazonS3.createBucket(bucketName);

        return "success";
    }
}
