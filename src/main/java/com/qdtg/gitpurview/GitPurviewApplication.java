package com.qdtg.gitpurview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class GitPurviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitPurviewApplication.class, args);
    }
}
