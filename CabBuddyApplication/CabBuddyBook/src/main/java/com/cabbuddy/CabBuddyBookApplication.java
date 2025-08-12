package com.cabbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.cabbuddy")
@EnableDiscoveryClient
public class CabBuddyBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBuddyBookApplication.class, args);
		System.err.println("Cab Buddy Book Microservice Up!");
	}

}
