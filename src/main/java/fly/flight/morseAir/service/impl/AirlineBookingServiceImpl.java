package fly.flight.morseAir.service.impl;

import fly.flight.morseAir.data.model.AirlinesBooking;
import fly.flight.morseAir.data.repository.AirlinesBookingRepository;
import fly.flight.morseAir.service.AirlineBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirlineBookingServiceImpl implements AirlineBookingService {

    private final AirlinesBookingRepository airlinesBookingRepository;

    @Override
    public AirlinesBooking addAirlines(AirlinesBooking airlines) {
        return airlinesBookingRepository.save(airlines);
    }

    @Override
    public AirlinesBooking editAirlines(AirlinesBooking airlines) {
        if (airlines.getAirlines_booking_id() == null || !airlinesBookingRepository.existsById(airlines.getAirlines_booking_id())) {
            // Handle invalid airlines or ID not found
            return null;
        }
        return airlinesBookingRepository.save(airlines);
    }

    @Override
    public AirlinesBooking updateAirlines(AirlinesBooking airlines) {
        if (airlines.getAirlines_booking_id() == null || !airlinesBookingRepository.existsById(airlines.getAirlines_booking_id())) {
            // Handle invalid airlines or ID not found
            return null;
        }
        return airlinesBookingRepository.save(airlines);
    }

    @Override
    public void deleteAirlines(long airlinesId) {
        airlinesBookingRepository.deleteById(airlinesId);
    }

    @Override
    public List<AirlinesBooking> saveAirlines(List<AirlinesBooking> airlines) {
        return airlinesBookingRepository.saveAll(airlines);
    }

    @Override
    public List<AirlinesBooking> searchAirlines(String searchTerm) {
        // Implement search logic using repository methods or custom query
        return airlinesBookingRepository.findByNameContaining(searchTerm);
    }
}
