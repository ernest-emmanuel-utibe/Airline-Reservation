package fly.flight.morseAir.service.impl;

import fly.flight.morseAir.data.model.AirlineEnquiry;
import fly.flight.morseAir.data.repository.AirlineEnquiryRepository;
import fly.flight.morseAir.exceptions.AirlineEnquiryNotFoundException;
import fly.flight.morseAir.service.AirlineEnquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirlineEnquiryServiceImpl implements AirlineEnquiryService {

    private final AirlineEnquiryRepository airlineEnquiryRepository;

    @Override
    public AirlineEnquiry addAirlineEnquiry(AirlineEnquiry airlineEnquiry) {
        return airlineEnquiryRepository.save(airlineEnquiry);
    }

    @Override
    public AirlineEnquiry editAirlineEnquiry(AirlineEnquiry airlineEnquiry) {
        Long enquiryId = airlineEnquiry.getAirline_enquiry_id();

        if (airlineEnquiry.getAirline_enquiry_id() == null ||
                !airlineEnquiryRepository.existsById(airlineEnquiry.getAirline_enquiry_id())) {
            // Handle invalid airline enquiry or ID not found
            throw new AirlineEnquiryNotFoundException("Airline Enquiry with ID " + enquiryId + " not found");
        }
        return airlineEnquiryRepository.save(airlineEnquiry);
    }

    @Override
    public AirlineEnquiry updateAirlineEnquiry(AirlineEnquiry airlineEnquiry) {
        Long enquiryId = airlineEnquiry.getAirline_enquiry_id();
        if (airlineEnquiry.getAirline_enquiry_id() == null ||
                !airlineEnquiryRepository.existsById(airlineEnquiry.getAirline_enquiry_id())) {
            // Handle invalid airline enquiry or ID not found
            throw new AirlineEnquiryNotFoundException("Airline Enquiry with ID " + enquiryId + " not found");
        }
        return airlineEnquiryRepository.save(airlineEnquiry);
    }

    @Override
    public void deleteAirlineEnquiry(long airlineEnquiryId) {
        airlineEnquiryRepository.deleteById(airlineEnquiryId);
    }

    @Override
    public List<AirlineEnquiry> saveAirlineEnquiry(List<AirlineEnquiry> airlineEnquiries) {
        return airlineEnquiryRepository.saveAll(airlineEnquiries);
    }

    @Override
    public List<AirlineEnquiry> searchAirlineEnquiry(String airline_enquiry_title, String airline_enquiry_description) {
        // Implement search logic using repository methods or custom query
        return airlineEnquiryRepository.findByAirline_enquiry_titleOrAirline_Enquiry_DescriptionContaining(
                airline_enquiry_title,  airline_enquiry_description);
    }
}
