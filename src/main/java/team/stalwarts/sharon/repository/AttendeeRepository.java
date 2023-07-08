package team.stalwarts.sharon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import team.stalwarts.sharon.model.Attendee;



public interface AttendeeRepository extends JpaRepository<Attendee,Long>
{
  List<Attendee> findAttendeeByEventId(Long id);
}
