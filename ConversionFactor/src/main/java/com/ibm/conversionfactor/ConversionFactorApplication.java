package com.ibm.conversionfactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConversionFactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionFactorApplication.class, args);
	}

}
