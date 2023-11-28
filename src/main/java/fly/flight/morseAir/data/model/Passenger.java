package fly.flight.morseAir.data.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    private Long passenger_id;
    private String passenger_name;
    private String passenger_mobile;
    private String passenger_email;
    private String passenger_username;
    private String passenger_password;
    private String passenger_address;
}
