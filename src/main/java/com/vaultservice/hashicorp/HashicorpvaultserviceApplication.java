package com.vaultservice.hashicorp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.vaultservice.hashicorp.configuration.Configuration;

@SpringBootApplication
@EnableConfigurationProperties(Configuration.class)
public class HashicorpvaultserviceApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(HashicorpvaultserviceApplication.class);
	
	private Configuration configuration;
	
	public HashicorpvaultserviceApplication(Configuration configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {
		SpringApplication.run(HashicorpvaultserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("---------------Properties---------------");
		logger.info("UserName :- " + configuration.getUserName());
		logger.info("UserPassword :- " + configuration.getUserPassword());
	}

}
