package fly.flight.morseAir.service.impl;

import fly.flight.morseAir.data.model.Passenger;
import fly.flight.morseAir.data.repository.PassengerRepository;
import fly.flight.morseAir.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger editPassenger(Passenger passenger) {
        if (passenger.getPassenger_id() == null || !passengerRepository.existsById(passenger.getPassenger_id())) {
            // Handle invalid passenger or ID not found
            return null;
        }
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger updatePassenger(Passenger passenger) {
        if (passenger.getPassenger_id() == null || !passengerRepository.existsById(passenger.getPassenger_id())) {
            // Handle invalid passenger or ID not found
            return null;
        }
        return passengerRepository.save(passenger);
    }

    @Override
    public void deletePassenger(long passengerId) {
        passengerRepository.deleteById(passengerId);
    }

    @Override
    public List<Passenger> savePassenger(List<Passenger> passengers) {
        return passengerRepository.saveAll(passengers);
    }

    @Override
    public List<Passenger> searchPassenger(String searchTerm) {
        // Implement search logic using repository methods or custom query
        return passengerRepository.findByFirstNameContainingOrLastNameContaining(searchTerm, searchTerm);
    }
}
