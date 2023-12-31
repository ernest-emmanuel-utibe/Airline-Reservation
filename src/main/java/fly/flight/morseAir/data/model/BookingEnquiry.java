package fly.flight.morseAir.data.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookingEnquiry {
    private Long booking_enquiry_id;
    private String booking_enquiry_title;
    private String booking_enquiry_type;
    private LocalDate booking_enquiry_date;
    private String booking_enquiry_description;
}
