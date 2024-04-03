//package com.course.kafka;
//
//import org.apache.kafka.clients.consumer.Consumer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
//import org.springframework.kafka.listener.ListenerExecutionFailedException;
//import org.springframework.messaging.Message;
//
//public class GlobalErrorHandler implements ConsumerAwareErrorHandler {
//
//	private final Logger log = LoggerFactory.getLogger(getClass());
//	
////	@Override
////	public Object handleError(Message<?> message, ListenerExecutionFailedException exception, Consumer<?, ?> consumer) {
////		log.warn("Global error handler for message : {}", data.value().toString());
////		return null;
////	}
//
//}
