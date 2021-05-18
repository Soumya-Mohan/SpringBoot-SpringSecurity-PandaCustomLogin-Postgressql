package com.security.Spring_boot_security_Customlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringBootSecurityCustomloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityCustomloginApplication.class, args);
	}

}
