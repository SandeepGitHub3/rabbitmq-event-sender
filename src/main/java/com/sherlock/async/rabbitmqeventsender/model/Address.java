package com.sherlock.async.rabbitmqeventsender.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
public class Address extends BaseEntity{

	@NotNull
	private String addressType;

	@NotNull
	private String line1;

	private String lien2;

	@NotNull
	private String city;

	private String state;

	private String country ;
}
