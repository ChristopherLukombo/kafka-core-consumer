package com.course.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GeneralLedgerConsumer {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@KafkaListener(id = "general-ledger.one", topics = "t-general-ledger")
	public void consumeOne(String message) {
		log.info("From consumer One : {}", message);
	}
	
	@KafkaListener(topics = "t-general-ledger")
	public void consumeTwo(String message) {
		log.info("From consumer One : {}", message);
	}
}
