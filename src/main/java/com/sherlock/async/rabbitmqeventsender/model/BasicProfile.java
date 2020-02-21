package com.sherlock.async.rabbitmqeventsender.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
public class BasicProfile extends BaseEntity{

	@NonNull
	private String name;
	private Integer phoneNumber;
	private String email;

	@OneToOne
	@JoinColumn(name="recipient_id")
	private Recipient recipient;
}
