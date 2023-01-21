package com.dewacoding.loansservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.dewacoding.loansservice.controller")})
@EnableJpaRepositories("com.dewacoding.loansservice.repository")
@EntityScan("com.dewacoding.loansservice.model")
public class LoansserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansserviceApplication.class, args);
	}

}
