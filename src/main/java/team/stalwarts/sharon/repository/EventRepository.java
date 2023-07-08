package team.stalwarts.sharon.repository;

import team.stalwarts.sharon.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;




public interface EventRepository extends JpaRepository<Event,Long> 
{

}
