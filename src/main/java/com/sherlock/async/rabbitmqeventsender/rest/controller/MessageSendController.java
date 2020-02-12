package com.sherlock.async.rabbitmqeventsender.rest.controller;

import com.sherlock.async.rabbitmqeventsender.model.Event;
import com.sherlock.async.rabbitmqeventsender.sender.MessageSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("event-chase")
public class MessageSendController {

	private final MessageSender messageSender;

	@PostMapping("/direct-exchange")
	public String directExchange(@RequestBody Event event) {
		messageSender.sendToDirectExchange(event);
		return "Direct Message Event";
	}

	@PostMapping("/topic-exchange")
	public String topicExchange(@RequestBody Event event) {
		messageSender.sendToTopicExchange(event);
		return "Topic Exchange Event";
	}

	@PostMapping("/fanout-exchange")
	public String fanoutExchange(@RequestBody Event event) {
		messageSender.sendToFanoutExchange(event);
		return "Fanout Exchange Event";
	}
}
