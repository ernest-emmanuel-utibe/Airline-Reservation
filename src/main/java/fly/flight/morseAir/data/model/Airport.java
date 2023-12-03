package fly.flight.morseAir.data.model;

import fly.flight.morseAir.data.model.flight.FlightInstance;

import java.util.List;

public class Airport {
    private String name;
    private String code;
    private Address address;
    private List<FlightInstance> instances;
}
