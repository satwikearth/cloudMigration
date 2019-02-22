package com.earth.cloudmigration.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {
    @Bean
    public AWSCredentials getAwsCredentials() {
        return new ProfileCredentialsProvider().getCredentials();
    }

    @Bean
    public AmazonS3 getAmazonS3(AWSCredentials awsCredentials) {
        return new AmazonS3Client(awsCredentials);
    }
}

