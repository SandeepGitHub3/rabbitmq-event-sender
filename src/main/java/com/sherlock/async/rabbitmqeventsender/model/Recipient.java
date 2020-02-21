package com.sherlock.async.rabbitmqeventsender.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
public class Recipient extends BaseEntity{

	@OneToOne(mappedBy = "recipient", cascade= CascadeType.ALL)
	private BasicProfile basicProfile;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="recipientId")
	private List<Address> addresses;

	@OneToOne
	@JoinColumn(name="eventId")
	private Event event;
}
