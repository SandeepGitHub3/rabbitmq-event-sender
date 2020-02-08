package com.sherlock.async.rabbitmqeventsender.sender;

import com.sherlock.async.rabbitmqeventsender.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_DIRECT_EXCHANGE;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_FANOUT_EXCHANGE;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_ROUTING_KEY;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_TOPIC_EXCHANGE;

@Service
public class MessageSender {
	private static final Logger logger = LoggerFactory.getLogger(MessageSender.class);

	private final RabbitTemplate rabbitTemplate;

	@Autowired
	public MessageSender(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendToDirectExchange(Event event) {
		logger.info("Direct Exchange :{} Routing Key:{}",JAVA_LABS_DIRECT_EXCHANGE,JAVA_LABS_ROUTING_KEY);
		rabbitTemplate.convertAndSend(JAVA_LABS_DIRECT_EXCHANGE, JAVA_LABS_ROUTING_KEY, event);
	}

	public void sendToTopicExchange(Event event) {
		logger.info("Topic Exchange :{} Routing Key:{}",JAVA_LABS_TOPIC_EXCHANGE,"java");
		rabbitTemplate.convertAndSend(JAVA_LABS_TOPIC_EXCHANGE, "java", event);
	}

	public void sendToFanoutExchange(Event event) {
		logger.info("Fanout Exchange :{}",JAVA_LABS_FANOUT_EXCHANGE);
		rabbitTemplate.convertAndSend(JAVA_LABS_FANOUT_EXCHANGE, "", event);
	}
}
