package fly.flight.morseAir.data.model;

import lombok.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlinesBooking {
    private Long airlines_booking_id;
    private Long airlines_passenger_id;
    private String airlines_booking_type;
    private LocalDate airlines_booking_date;
    private String airlines_booking_description;
}
