package com.example.education.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.education.Figen")
public class FeignConfiguration {
    // no additional configuration needed
}
