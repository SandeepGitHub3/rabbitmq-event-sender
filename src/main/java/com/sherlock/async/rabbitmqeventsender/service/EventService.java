package com.sherlock.async.rabbitmqeventsender.service;

import com.sherlock.async.rabbitmqeventsender.model.Event;
import com.sherlock.async.rabbitmqeventsender.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {

	private final EventRepository eventRepository;

	public void persistEvent(List<Event> eventList) {
		log.info("Save Event List:{}", eventList);

		//TODO Need to check of this is the right way to persist this
		eventList.forEach(event -> {
					event.getRecipient().setEvent(event);
					event.getRecipient().getBasicProfile().setRecipient(event.getRecipient());
				}
		);

		eventRepository.saveAll(eventList);
	}

}
