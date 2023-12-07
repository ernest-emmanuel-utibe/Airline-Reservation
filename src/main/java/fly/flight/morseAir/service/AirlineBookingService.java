package fly.flight.morseAir.service;

import fly.flight.morseAir.data.model.AirlinesBooking;

import java.util.List;

public interface AirlineBookingService {
    AirlinesBooking addAirlines(AirlinesBooking airlines);
    AirlinesBooking editAirlines(AirlinesBooking airlines);
    AirlinesBooking updateAirlines(AirlinesBooking airlines);
    void deleteAirlines(long airlinesId);
    List<AirlinesBooking> saveAirlines(List<AirlinesBooking> airlines);
    List<AirlinesBooking> searchAirlines(String searchTerm);
}
