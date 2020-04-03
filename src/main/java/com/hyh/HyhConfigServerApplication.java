package com.hyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HyhConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyhConfigServerApplication.class, args);
	}

}
