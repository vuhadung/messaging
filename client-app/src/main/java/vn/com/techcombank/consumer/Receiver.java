package vn.com.techcombank.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	@KafkaListener(topics = "TCB")
	public void receive(String payload) {
		LOGGER.info("received payload = {}", payload);
		//TODO send to Firebase
	}

}
