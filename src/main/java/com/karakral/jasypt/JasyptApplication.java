package com.karakral.jasypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JasyptApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JasyptApplication.class, args);
		AppService appService = context.getBean(AppService.class);
		System.out.println("Let's enjoy jasypt ");
		appService.printConfiguration();
	}

}
