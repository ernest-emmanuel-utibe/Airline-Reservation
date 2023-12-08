package fly.flight.morseAir.service;

import fly.flight.morseAir.data.model.AirlineEnquiry;

import java.util.List;

public interface AirlineEnquiryService {
    AirlineEnquiry addAirlineEnquiry(AirlineEnquiry airlineEnquiry);
    AirlineEnquiry editAirlineEnquiry(AirlineEnquiry airlineEnquiry);
    AirlineEnquiry updateAirlineEnquiry(AirlineEnquiry airlineEnquiry);
    void deleteAirlineEnquiry(long airlineEnquiryId);
    List<AirlineEnquiry> saveAirlineEnquiry(List<AirlineEnquiry> airlineEnquiries);
    List<AirlineEnquiry> searchAirlineEnquiry(String searchTerm);
}
