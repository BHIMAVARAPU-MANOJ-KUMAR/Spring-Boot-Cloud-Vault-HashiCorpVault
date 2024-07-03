package com.vaultservice.hashicorp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("vaultservice")
public class Configuration {
	private String userName;
	private String userPassword;
}
