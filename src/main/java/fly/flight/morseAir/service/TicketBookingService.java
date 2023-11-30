package fly.flight.morseAir.service;

import fly.flight.morseAir.data.model.TicketBooking;

import java.util.List;

public interface TicketBookingService {
    TicketBooking addTicket(TicketBooking ticket);
    TicketBooking editTicket(Long ticketId, TicketBooking updatedTicket);
    TicketBooking updateTicket(Long ticketId, TicketBooking updatedTicket);
    void deleteTicket(Long ticketId);
    TicketBooking saveTicket(TicketBooking ticket);
    List<TicketBooking> searchTicket(String searchTerm);
}
