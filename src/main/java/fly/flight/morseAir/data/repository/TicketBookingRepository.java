package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.TicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Long> {
}
