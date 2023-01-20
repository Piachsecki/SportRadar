package com.example.app.services;

import com.example.app.repositories.EventRepository;
import com.example.app.classes.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

@Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents(){
        return eventRepository.findAll();
    }


    public void addNewEvent(Event event){
        eventRepository.save(event);
    }

}
