package com.cabbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.cabbuddy")
@EnableDiscoveryClient
public class CabBuddyFareApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBuddyFareApplication.class, args);
		System.err.println("Cab Buddy Fare Microservice Up!");
	}

}
