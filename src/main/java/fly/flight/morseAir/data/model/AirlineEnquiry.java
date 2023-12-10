package fly.flight.morseAir.data.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AirlineEnquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long airline_enquiry_id;
    private String airline_enquiry_title;
    private String airline_enquiry_type;
    private LocalDate airline_enquiry_date;
    private String airline_enquiry_description;
    @ManyToOne
    private Airline airline;
}
