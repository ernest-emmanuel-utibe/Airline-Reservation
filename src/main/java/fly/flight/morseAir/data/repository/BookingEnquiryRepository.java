package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.BookingEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingEnquiryRepository extends JpaRepository<BookingEnquiry, Long> {
}
