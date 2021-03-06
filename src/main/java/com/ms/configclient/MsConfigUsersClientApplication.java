package com.ms.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsConfigUsersClientApplication {

	private static final Logger log = LoggerFactory.getLogger(MsConfigUsersClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MsConfigUsersClientApplication.class, args);
		log.info("Entered MsConfigUsersClientApplication :: main()");
	}

}
