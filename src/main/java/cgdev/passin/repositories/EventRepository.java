package cgdev.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cgdev.passin.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {

}
