package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    List<Passenger> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}
