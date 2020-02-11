package com.sherlock.async.rabbitmqeventsender.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Event {
	private String orderId;
	private List<Product> products;
	private Recipient recipient;
}
