package cgdev.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cgdev.passin.domain.checkin.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {

}
