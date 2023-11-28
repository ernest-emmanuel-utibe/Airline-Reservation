package fly.flight.morseAir.data.model;

import lombok.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketBooking {
    private Long ticket_id;
    private String ticket_type;
    private Long ticket_booking_id;
    private LocalDate ticket_date;
    private String ticket_description;
}
