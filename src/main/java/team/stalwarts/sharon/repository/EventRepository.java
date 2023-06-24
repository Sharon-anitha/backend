package team.stalwarts.sharon.repository;

import team.stalwarts.sharon.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EventRepository extends JpaRepository<Event,Long> {

}