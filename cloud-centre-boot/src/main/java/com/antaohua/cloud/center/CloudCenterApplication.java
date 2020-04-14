package com.antaohua.cloud.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.antaohua.center")
@EnableWebMvc
public class CloudCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudCenterApplication.class, args);
	}
}
