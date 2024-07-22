package com.ust.Tourism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TourismApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourismApplication.class, args);
	}

}
