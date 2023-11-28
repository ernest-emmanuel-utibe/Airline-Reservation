package fly.flight.morseAir.data.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private BookingEnquiry bookingEnquiry;
    private AirlineEnquiry airlineEnquiry;
    private TicketBooking ticketBooking;
    private Passenger passenger;
    private AirlinesBooking airlinesBooking;

}
