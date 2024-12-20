package com.example.ms_requestCredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsRequestCreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRequestCreditApplication.class, args);
	}

}
