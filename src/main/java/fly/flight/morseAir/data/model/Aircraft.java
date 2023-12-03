package fly.flight.morseAir.data.model;

import fly.flight.morseAir.data.model.seat.Seat;

import java.util.List;

public class Aircraft {
    private String name;
    private String code;
    private String model;
    private int seat_capacity;
    private List<Seat> seats;
}
