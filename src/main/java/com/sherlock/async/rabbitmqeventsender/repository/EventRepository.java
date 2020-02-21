package com.sherlock.async.rabbitmqeventsender.repository;

import com.sherlock.async.rabbitmqeventsender.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
