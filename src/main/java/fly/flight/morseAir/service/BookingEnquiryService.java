package fly.flight.morseAir.service;

import fly.flight.morseAir.data.model.BookingEnquiry;

import java.util.List;

public interface BookingEnquiryService {
    BookingEnquiry addBooking(BookingEnquiry booking);
    BookingEnquiry editBooking(BookingEnquiry booking);
    BookingEnquiry updateBooking(BookingEnquiry booking);
    void deleteBooking(long bookingId);
    List<BookingEnquiry> saveBookings(List<BookingEnquiry> bookings);
    List<BookingEnquiry> searchBookings(String searchTerm);
}
