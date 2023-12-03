package fly.flight.morseAir.data.model.flight;

import fly.flight.morseAir.data.model.Airport;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private String flight_number;
    private int duration_minute;
    private Airport arrival;
    private List<FlightInstance> instances;
}
