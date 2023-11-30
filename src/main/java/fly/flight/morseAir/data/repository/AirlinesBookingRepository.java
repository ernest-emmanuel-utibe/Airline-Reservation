package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.AirlinesBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlinesBookingRepository extends JpaRepository<AirlinesBooking, Long> {
}