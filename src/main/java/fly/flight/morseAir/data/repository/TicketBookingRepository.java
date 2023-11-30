package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.TicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Long> {
    List<TicketBooking> findByTitleContainingOrDescriptionContaining(String title, String description);
}
