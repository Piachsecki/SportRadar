package com.example.app;

import com.example.app.classes.Event;
import com.example.app.repositories.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
//
//@Configuration
//public class EventConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(EventRepository eventRepository) {
//        return args -> {
//            Event event1 = new Event(
//                    "sr:sport_event:27636100",
//                    LocalDateTime.now(),
//                    "Soccer",
//                    "UEFA Champions League",
//                    "sr:competition:7",
//                    "UEFA Champions League 21/22",
//                    2.5,
//                    88.1,
//                    9.4
//            );
//
//            eventRepository.save(event1);
//        };
//
//    }
//}
