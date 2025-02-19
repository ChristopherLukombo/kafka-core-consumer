package com.course.kafka.consumer;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.course.kafka.entity.Commodity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CommodityDashboardConsumer {
	
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private ObjectMapper objectMapper;
	
	@KafkaListener(topics = "t-commodity", groupId = "cg-dashboard")
	public void consume(String message) throws JsonMappingException, JsonProcessingException, InterruptedException {
		var commodity = objectMapper.readValue(message, Commodity.class);
		
		var randomDelayMillis = ThreadLocalRandom.current().nextLong(500, 2000);
		TimeUnit.MICROSECONDS.sleep(randomDelayMillis);
		log.info("Dashboard logic for : {}", commodity);
	}
}
