package fly.flight.morseAir.controller;

import fly.flight.morseAir.data.model.BookingEnquiry;
import fly.flight.morseAir.service.BookingEnquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingEnquiryController {

    private final BookingEnquiryService bookingService;

    @PostMapping("/add")
    public ResponseEntity<BookingEnquiry> addBooking(@RequestBody BookingEnquiry booking) {
        BookingEnquiry addedBooking = bookingService.addBooking(booking);
        if (addedBooking != null) {
            return new ResponseEntity<>(addedBooking, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<BookingEnquiry> editBooking(@RequestBody BookingEnquiry booking) {
        BookingEnquiry editedBooking = bookingService.editBooking(booking);
        if (editedBooking != null) {
            return new ResponseEntity<>(editedBooking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/update")
    public ResponseEntity<BookingEnquiry> updateBooking(@RequestBody BookingEnquiry booking) {
        BookingEnquiry updatedBooking = bookingService.updateBooking(booking);
        if (updatedBooking != null) {
            return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{bookingId}")
    public ResponseEntity<Void> deleteBooking(@PathVariable long bookingId) {
        bookingService.deleteBooking(bookingId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<List<BookingEnquiry>> saveBookings(@RequestBody List<BookingEnquiry> bookings) {
        List<BookingEnquiry> savedBookings = bookingService.saveBookings(bookings);
        return new ResponseEntity<>(savedBookings, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<BookingEnquiry>> searchBookings(@RequestParam("searchTerm") String searchTerm) {
        List<BookingEnquiry> foundBookings = bookingService.searchBookings(searchTerm);
        return new ResponseEntity<>(foundBookings, HttpStatus.OK);
    }
}
