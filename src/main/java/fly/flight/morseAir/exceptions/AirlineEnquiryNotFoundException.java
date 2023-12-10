package fly.flight.morseAir.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AirlineEnquiryNotFoundException extends RuntimeException{
    public AirlineEnquiryNotFoundException(String message) {
        super(message);
    }
}
