package cgdev.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cgdev.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {

}
