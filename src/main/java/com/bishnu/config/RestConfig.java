package com.bishnu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.bishnu.Entity.PostOffice;

@Configuration
public class RestConfig {
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	@Bean
	public PostOffice postOffice() {
		return null;
		
	}
}
