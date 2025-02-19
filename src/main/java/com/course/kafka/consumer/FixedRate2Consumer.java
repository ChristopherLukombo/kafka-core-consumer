package com.course.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class FixedRate2Consumer {

	private static final Logger log = LoggerFactory.getLogger(FixedRate2Consumer.class);
	
	@KafkaListener(topics = "t-fixedrate-2")
	public void consume(String message) {
		log.info("Consumming : {}", message);
	}
}
