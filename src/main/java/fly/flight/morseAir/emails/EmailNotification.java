package fly.flight.morseAir.emails;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotification {

    private String email;
    private Boolean email_notification;
}
