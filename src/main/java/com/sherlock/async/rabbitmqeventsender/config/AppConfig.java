package com.sherlock.async.rabbitmqeventsender.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_DIRECT_EXCHANGE;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_FANOUT_EXCHANGE;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_QUEUE;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_ROUTING_KEY;
import static com.sherlock.async.rabbitmqeventsender.constants.Constants.JAVA_LABS_TOPIC_EXCHANGE;

@Configuration
public class AppConfig {

	@Bean
	Queue queue() {
		return new Queue(JAVA_LABS_QUEUE, false);
	}

	@Bean
	DirectExchange exchange() {
		return new DirectExchange(JAVA_LABS_DIRECT_EXCHANGE);
	}

	@Bean
	TopicExchange topicExchange() {
		return new TopicExchange(JAVA_LABS_TOPIC_EXCHANGE);
	}

	@Bean
	FanoutExchange fanoutExchange() {
		return new FanoutExchange(JAVA_LABS_FANOUT_EXCHANGE);
	}

	@Bean
	Binding directExchangeBinding(Queue queue, DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(JAVA_LABS_ROUTING_KEY);
	}

	@Bean
	Binding topicExchangeBinding(Queue queue, TopicExchange topicExchange) {
		return BindingBuilder.bind(queue).to(topicExchange).with("java");
	}

	@Bean
	Binding fanoutExchangeBinding(Queue queue, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(queue).to(fanoutExchange);
	}

	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
		return rabbitTemplate;
	}
}
