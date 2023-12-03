package fly.flight.morseAir.data.model.flight;

import fly.flight.morseAir.data.model.Aircraft;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FlightInstance {
    private Flight flight;
    private LocalDateTime departure_time;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;
    private List<FlightSeat> seats;
}
