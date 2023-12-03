package fly.flight.morseAir.data.model.account;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private AccountStatus status;
    private Integer id;
    private String username;
    private String password;
}
