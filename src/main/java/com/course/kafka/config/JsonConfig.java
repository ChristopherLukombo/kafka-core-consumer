package com.course.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
public class JsonConfig {

	@Bean
	public ObjectMapper objectMapper() {
		var objectMapper = new ObjectMapper();
		objectMapper.findAndRegisterModules();
		objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
		
		return objectMapper;
	}
}
