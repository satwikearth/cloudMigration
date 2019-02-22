package com.earth.cloudmigration;

import com.earth.cloudmigration.StorageService.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static java.lang.System.exit;

@SpringBootApplication
@ComponentScan(basePackages = {"com.earth"})
public class CloudmigrationApplication implements CommandLineRunner {

    @Autowired
    S3Service s3Service;

    public static void main(String[] args) {
        SpringApplication.run(CloudmigrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        String bucketName = "first-cloud-migrate-bucket";

        s3Service.createBucket(bucketName);

        exit(0);
    }
}
