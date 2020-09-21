package com.ibm.tc.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesTestApplication {
	 private static final Logger log = LoggerFactory.getLogger(MicroservicesTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesTestApplication.class, args);
	}

}
