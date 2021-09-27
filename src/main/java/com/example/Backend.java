package com.example;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Backend {

	private static final Logger log = LoggerFactory.getLogger(Backend.class);

	@RequestMapping("/now")
	public String now() {
		String s = new Date().toString();
		log.info(s);
		return s;
	}

	public static void main(String[] args) {
		SpringApplication.run(Backend.class, "--spring.application.name=backend", "--server.port=9000");
	}

}
