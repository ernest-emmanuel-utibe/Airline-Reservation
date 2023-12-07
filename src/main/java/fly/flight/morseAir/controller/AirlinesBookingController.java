package fly.flight.morseAir.controller;

import fly.flight.morseAir.data.model.AirlinesBooking;
import fly.flight.morseAir.service.AirlineBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airlines")
@RequiredArgsConstructor
public class AirlinesBookingController {
    private final AirlineBookingService airlineBookingService;

    @PostMapping("/add")
    public ResponseEntity<AirlinesBooking> addAirlines(@RequestBody AirlinesBooking airlinesBooking) {
        AirlinesBooking addedAirlines = airlineBookingService.addAirlines(airlinesBooking);
        if (addedAirlines != null) {
            return new ResponseEntity<>(addedAirlines, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<AirlinesBooking> editAirlines(@RequestBody AirlinesBooking airlinesBooking) {
        AirlinesBooking editedAirlines = airlineBookingService.editAirlines(airlinesBooking);
        if (editedAirlines != null) {
            return new ResponseEntity<>(editedAirlines, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/update")
    public ResponseEntity<AirlinesBooking> updateAirlines(@RequestBody AirlinesBooking airlinesBooking) {
        AirlinesBooking updatedAirlines = airlineBookingService.updateAirlines(airlinesBooking);
        if (updatedAirlines != null) {
            return new ResponseEntity<>(updatedAirlines, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{airlinesId}")
    public ResponseEntity<Void> deleteAirlines(@PathVariable long airlinesId) {
        airlineBookingService.deleteAirlines(airlinesId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<List<AirlinesBooking>> saveAirlines(@RequestBody List<AirlinesBooking> airlines) {
        List<AirlinesBooking> savedAirlines = airlineBookingService.saveAirlines(airlines);
        return new ResponseEntity<>(savedAirlines, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<AirlinesBooking>> searchAirlines(@RequestParam("searchTerm") String searchTerm) {
        List<AirlinesBooking> foundAirlines = airlineBookingService.searchAirlines(searchTerm);
        return new ResponseEntity<>(foundAirlines, HttpStatus.OK);
    }
}
