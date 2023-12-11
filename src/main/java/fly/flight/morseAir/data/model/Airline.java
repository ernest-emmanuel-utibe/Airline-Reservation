package fly.flight.morseAir.data.model;

import jakarta.persistence.*;

@Entity
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String contactNumber;
}
