package fly.flight.morseAir.data.repository;

import fly.flight.morseAir.data.model.AirlineEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirlineEnquiryRepository extends JpaRepository<AirlineEnquiry, Long> {
    List<AirlineEnquiry> findByAirline_enquiry_titleOrAirline_Enquiry_DescriptionContaining(String airline_enquiry_title
            , String airline_enquiry_description);

    List<AirlineEnquiry> findByAirline(Airline airline);
}
