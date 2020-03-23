package com.elensol.storiesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GithubSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubSpringCloudConfigServerApplication.class, args);
	}

}
