package com.idat.EC4HospedajeMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Ec4HospedajeMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec4HospedajeMicroservicioApplication.class, args);
	}

}
