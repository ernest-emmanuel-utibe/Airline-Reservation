package fly.flight.morseAir.payments;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer payment_id;
    private Double amount;
    private PaymentStatus status;
    private LocalDateTime time_stamp;
}
