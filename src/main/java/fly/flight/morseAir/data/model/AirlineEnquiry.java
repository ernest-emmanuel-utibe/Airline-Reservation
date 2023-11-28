package fly.flight.morseAir.data.model;

import lombok.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlineEnquiry {
    private Long airline_enquiry_id;
    private String airline_enquiry_title;
    private String airline_enquiry_type;
    private LocalDate airline_enquiry_date;
    private String airline_enquiry_description;
}
