package com.hj.pjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
@EnableJpaAuditing
public class HyejinProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(HyejinProject1Application.class, args);
	}

}
