package com.course.kafka.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GenerakLedgerScheduler {

	@Autowired
	private KafkaListenerEndpointRegistry registry;
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Scheduled(cron = "0 0 23 * * ?")
	public void stop() {
		log.info("Stopping consumer");
		registry.getListenerContainer("general-ledger.one").pause();
	}
	
	@Scheduled(cron = "1 0 23 * * ?")
	public void start() {
		log.info("Stopping consumer");
		registry.getListenerContainer("general-ledger.one").resume();
	}
}
