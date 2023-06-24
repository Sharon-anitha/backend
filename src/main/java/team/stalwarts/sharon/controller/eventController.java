package team.stalwarts.sharon.controller;

import team.stalwarts.sharon.exception.ResourceNotFoundException;
import team.stalwarts.sharon.model.Event;
import team.stalwarts.sharon.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/events")
public class eventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }


    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @GetMapping("{id}")
    public ResponseEntity<Event> getEventById(@PathVariable long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("event not exist with id:" + id));
        return ResponseEntity.ok(event);
    }


    @PutMapping("{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable long id, @RequestBody Event eventDetails) {
        Event updateEvent = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("event not exist with id: " + id));

        updateEvent.setUrl(eventDetails.getUrl());
        updateEvent.setTitle(eventDetails.getTitle());
        updateEvent.setDate(eventDetails.getDate());
        updateEvent.setLocation(eventDetails.getLocation());
        updateEvent.setSpeaker(eventDetails.getSpeaker());
        updateEvent.setPrice(eventDetails.getPrice());

        eventRepository.save(updateEvent);

        return ResponseEntity.ok(updateEvent);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEvent(@PathVariable long id) {

        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("event not exist with id: " + id));

        eventRepository.delete(event);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}