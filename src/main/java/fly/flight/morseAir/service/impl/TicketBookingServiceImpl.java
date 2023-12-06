package fly.flight.morseAir.service.impl;

import fly.flight.morseAir.data.model.TicketBooking;
import fly.flight.morseAir.data.repository.TicketBookingRepository;
import fly.flight.morseAir.service.TicketBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketBookingServiceImpl implements TicketBookingService {

    private final TicketBookingRepository ticketBookingRepository;

    @Override
    public TicketBooking addTicket(TicketBooking ticket) {
        return ticketBookingRepository.save(ticket);
    }

    @Override
    public TicketBooking editTicket(Long ticketId, TicketBooking updatedTicket) {

        TicketBooking existingTicket = ticketBookingRepository.findById(ticketId)
                .orElseThrow();

        // Update the existing ticket with the new values.
        existingTicket.setTicket_booking_id(updatedTicket.getTicket_booking_id());
        existingTicket.setTicket_type(updatedTicket.getTicket_type());
        existingTicket.setTicket_description(updatedTicket.getTicket_description());
        existingTicket.setTicket_date(updatedTicket.getTicket_date());

        return ticketBookingRepository.save(existingTicket);
    }

    @Override
    public TicketBooking updateTicket(Long ticketId, TicketBooking updatedTicket) {
        TicketBooking existingTicket = ticketBookingRepository.findById(ticketId)
                .orElseThrow();

        // Update only the fields that are not null in the updatedTicket

        if (updatedTicket.getTicket_type() != null) {
            existingTicket.setTicket_type((updatedTicket.getTicket_type()));
        }
        if (updatedTicket.getTicket_description() != null) {
            existingTicket.setTicket_description((updatedTicket.getTicket_description()));
        }
        // Update other fields as needed
        if (updatedTicket.getTicket_booking_id() != null) {
            existingTicket.setTicket_booking_id((updatedTicket.getTicket_booking_id()));
        }
        if (updatedTicket.getTicket_date() != null) {
            existingTicket.setTicket_date((updatedTicket.getTicket_date()));
        }

        return ticketBookingRepository.save(existingTicket);
    }

    @Override
    public void deleteTicket(Long ticketId) {
        ticketBookingRepository.deleteById(ticketId);
    }

    @Override
    public TicketBooking saveTicket(TicketBooking ticket) {
        return ticketBookingRepository.save(ticket);
    }

    @Override
    public List<TicketBooking> searchTicket(String searchTerm) {
        return ticketBookingRepository.findByTitleContainingOrDescriptionContaining(searchTerm, searchTerm);
    }
}
