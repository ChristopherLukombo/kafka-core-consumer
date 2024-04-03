package com.course.kafka.handler;

import org.apache.kafka.clients.consumer.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service("myFoodOrderErrorHandler")
public class FoodOrderErrorHandler implements ConsumerAwareListenerErrorHandler {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public Object handleError(Message<?> message, ListenerExecutionFailedException exception, Consumer<?, ?> consumer) {
		log.warn("Food order error, sending to elasticsearch : {}, because : {}", message.getPayload(), exception.getMessage());
		return null;
	}

}
