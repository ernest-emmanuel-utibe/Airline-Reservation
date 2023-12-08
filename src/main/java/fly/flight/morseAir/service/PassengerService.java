package fly.flight.morseAir.service;

import fly.flight.morseAir.data.model.Passenger;

import java.util.List;

public interface PassengerService {
    Passenger addPassenger(Passenger passenger);
    Passenger editPassenger(Passenger passenger);
    Passenger updatePassenger(Passenger passenger);
    void deletePassenger(long passengerId);
    List<Passenger> savePassenger(List<Passenger> passengers);
    List<Passenger> searchPassenger(String searchTerm);
}
