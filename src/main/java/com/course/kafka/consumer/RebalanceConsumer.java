package com.course.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class RebalanceConsumer {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@KafkaListener(topics = "t-rebalance", concurrency = "3")
	public void consume(ConsumerRecord<String, String> consumerRecord) {
		log.info("Partition : {} Offset : {}, Message : {}", consumerRecord.partition(), consumerRecord.offset(), consumerRecord.value());
	}
}
