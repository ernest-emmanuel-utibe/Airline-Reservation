package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.AirlineEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineEnquiryRepository extends JpaRepository<AirlineEnquiry, Long> {
}
