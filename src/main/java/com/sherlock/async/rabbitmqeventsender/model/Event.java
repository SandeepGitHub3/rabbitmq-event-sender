package com.sherlock.async.rabbitmqeventsender.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Event extends BaseEntity {

	private String orderId;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="eventId")
	private List<Product> products;

	@OneToOne(mappedBy = "event", cascade=CascadeType.ALL)
	private Recipient recipient;
}
