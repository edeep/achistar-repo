package com.achistart.techDummy.dockerJenkinsCIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DockerJenkinsCiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsCiDemoApplication.class, args);
	}

	@GetMapping("/achistar")
	public String landingPage() {
		System.out.println("Inside Landing main...");
		return ("Hello AchistarApplication");
	}
}
