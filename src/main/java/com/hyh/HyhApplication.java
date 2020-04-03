package com.hyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HyhApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyhApplication.class, args);
	}

}
