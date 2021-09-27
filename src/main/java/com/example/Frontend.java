package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@RestController
@CrossOrigin
public class Frontend {

	private RestTemplate restTemplate = new RestTemplate();

	private static final String URL = "http://localhost:9000/now";

	@RequestMapping("/")
	public String callBackend() {
		return restTemplate.getForObject(URL, String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Frontend.class, "--spring.application.name=frontend", "--server.port=9001");
	}

}
