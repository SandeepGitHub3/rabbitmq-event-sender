package com.sherlock.async.rabbitmqeventsender.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
public class Product extends BaseEntity{
	@NotNull
	private String name;
	private BigDecimal price;
}
