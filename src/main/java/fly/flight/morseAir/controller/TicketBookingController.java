package fly.flight.morseAir.controller;

import fly.flight.morseAir.data.model.TicketBooking;
import fly.flight.morseAir.service.TicketBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/tickets")
@RequiredArgsConstructor
public class TicketBookingController {

    private final TicketBookingService ticketBookingService;

    @PostMapping("/add")
    public ResponseEntity<TicketBooking> addTicket(@RequestBody TicketBooking ticketBooking) {
        TicketBooking addedTicket = ticketBookingService.addTicket(ticketBooking);
        if (addedTicket != null) {
            return new ResponseEntity<>(addedTicket, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<TicketBooking> editTicket(@RequestBody Long ticketBookingId, TicketBooking ticketBooking) {
        TicketBooking editedTicket = ticketBookingService.editTicket(ticketBookingId, ticketBooking);
        if (editedTicket != null) {
            return new ResponseEntity<>(editedTicket, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/update")
    public ResponseEntity<TicketBooking> updateTicket(@RequestBody Long ticketBookingId,TicketBooking ticketBooking) {
        TicketBooking updatedTicket = ticketBookingService.updateTicket(ticketBookingId, ticketBooking);
        if (updatedTicket != null) {
            return new ResponseEntity<>(updatedTicket, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{ticketId}")
    public ResponseEntity<Void> deleteTicket(@PathVariable long ticketId) {
        ticketBookingService.deleteTicket(ticketId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<List<TicketBooking>> saveTicket(@RequestBody List<TicketBooking> tickets) {
        List<TicketBooking> savedTickets = Collections.singletonList(ticketBookingService.saveTicket((TicketBooking) tickets));
        return new ResponseEntity<>(savedTickets, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<TicketBooking>> searchTicket(@RequestParam("searchTerm") String searchTerm) {
        List<TicketBooking> foundTickets = ticketBookingService.searchTicket(searchTerm);
        return new ResponseEntity<>(foundTickets, HttpStatus.OK);
    }
}
