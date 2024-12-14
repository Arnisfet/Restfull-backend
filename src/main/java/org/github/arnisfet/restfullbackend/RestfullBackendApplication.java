package org.github.arnisfet.restfullbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RestfullBackendApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestfullBackendApplication.class);

	public static void main(String[] args) {
		System.out.println("Starting");
		SpringApplication.run(RestfullBackendApplication.class, args);
		System.out.println("Started");
	}
}
