package com.sam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


import com.sam.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.sam"})// same as @Configuration @EnableAutoConfiguration @ComponentScan

public class DemoApplication extends SpringBootServletInitializer{

//	@RequestMapping("/hello")
//	String home() {
//		return "Hello World!";
//	}

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//
//	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}
}
