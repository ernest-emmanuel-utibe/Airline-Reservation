package fly.flight.morseAir.service;

import fly.flight.morseAir.data.dto.PaymentDao;
import fly.flight.morseAir.payments.Payment;

public interface PaymentService {
    Payment makePayment(PaymentDao paymentDao);
}
