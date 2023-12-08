package fly.flight.morseAir.controller;

import fly.flight.morseAir.data.model.Passenger;
import fly.flight.morseAir.service.PassengerService;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
@RequiredArgsConstructor
public class PassengerController {

    private final PassengerService passengerService;

    @PostMapping("/add")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        Passenger addedPassenger = passengerService.addPassenger(passenger);
        if (addedPassenger != null) {
            return new ResponseEntity<>(addedPassenger, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<Passenger> editPassenger(@RequestBody Passenger passenger) {
        Passenger editedPassenger = passengerService.editPassenger(passenger);
        if (editedPassenger != null) {
            return new ResponseEntity<>(editedPassenger, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/update")
    public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger passenger) {
        Passenger updatedPassenger = passengerService.updatePassenger(passenger);
        if (updatedPassenger != null) {
            return new ResponseEntity<>(updatedPassenger, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{passengerId}")
    public ResponseEntity<Void> deletePassenger(@PathVariable long passengerId) {
        passengerService.deletePassenger(passengerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<List<Passenger>> savePassenger(@RequestBody List<Passenger> passengers) {
        List<Passenger> savedPassengers = passengerService.savePassenger(passengers);
        return new ResponseEntity<>(savedPassengers, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Passenger>> searchPassenger(@RequestParam("searchTerm") String searchTerm) {
        List<Passenger> foundPassengers = passengerService.searchPassenger(searchTerm);
        return new ResponseEntity<>(foundPassengers, HttpStatus.OK);
    }
}
