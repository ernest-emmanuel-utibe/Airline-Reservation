package fly.flight.morseAir.controller;

import fly.flight.morseAir.data.model.AirlineEnquiry;
import fly.flight.morseAir.service.AirlineEnquiryService;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airline-enquiries")
@RequiredArgsConstructor
public class AirlineEnquiryController {

    private final AirlineEnquiryService airlineEnquiryService;

    @PostMapping("/add")
    public ResponseEntity<AirlineEnquiry> addAirlineEnquiry(@RequestBody AirlineEnquiry airlineEnquiry) {
        AirlineEnquiry addedAirlineEnquiry = airlineEnquiryService.addAirlineEnquiry(airlineEnquiry);
        if (addedAirlineEnquiry != null) {
            return new ResponseEntity<>(addedAirlineEnquiry, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<AirlineEnquiry> editAirlineEnquiry(@RequestBody AirlineEnquiry airlineEnquiry) {
        AirlineEnquiry editedAirlineEnquiry = airlineEnquiryService.editAirlineEnquiry(airlineEnquiry);
        if (editedAirlineEnquiry != null) {
            return new ResponseEntity<>(editedAirlineEnquiry, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/update")
    public ResponseEntity<AirlineEnquiry> updateAirlineEnquiry(@RequestBody AirlineEnquiry airlineEnquiry) {
        AirlineEnquiry updatedAirlineEnquiry = airlineEnquiryService.updateAirlineEnquiry(airlineEnquiry);
        if (updatedAirlineEnquiry != null) {
            return new ResponseEntity<>(updatedAirlineEnquiry, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{airlineEnquiryId}")
    public ResponseEntity<Void> deleteAirlineEnquiry(@PathVariable long airlineEnquiryId) {
        airlineEnquiryService.deleteAirlineEnquiry(airlineEnquiryId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<List<AirlineEnquiry>> saveAirlineEnquiry(@RequestBody List<AirlineEnquiry> airlineEnquiries) {
        List<AirlineEnquiry> savedAirlineEnquiries = airlineEnquiryService.saveAirlineEnquiry(airlineEnquiries);
        return new ResponseEntity<>(savedAirlineEnquiries, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<AirlineEnquiry>> searchAirlineEnquiry(@RequestParam("searchTerm")
                                                                     String airline_enquiry_title, String airline_enquiry_description) {

        List<AirlineEnquiry> foundAirlineEnquiries = airlineEnquiryService.searchAirlineEnquiry(airline_enquiry_title, airline_enquiry_description);
        return new ResponseEntity<>(foundAirlineEnquiries, HttpStatus.OK);
    }
}
