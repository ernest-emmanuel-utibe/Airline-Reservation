package fly.flight.morseAir.sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsNotification {
    private String number;
    private Boolean send_notification;
}
