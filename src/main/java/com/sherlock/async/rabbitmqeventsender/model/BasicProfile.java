package com.sherlock.async.rabbitmqeventsender.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class BasicProfile {
	private String name;
	private Integer phoneNumber;
	private String email;
}
