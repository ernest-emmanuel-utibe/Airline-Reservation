package fly.flight.morseAir.service.impl;

import fly.flight.morseAir.data.model.BookingEnquiry;
import fly.flight.morseAir.data.repository.BookingEnquiryRepository;
import fly.flight.morseAir.service.BookingEnquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingEnquiryServiceImpl implements BookingEnquiryService {

    private final BookingEnquiryRepository bookingRepository;

    @Override
    public BookingEnquiry addBooking(BookingEnquiry booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public BookingEnquiry editBooking(BookingEnquiry booking) {
        if (booking.getBooking_enquiry_id() == null || !bookingRepository.existsById(booking.getBooking_enquiry_id())) {
            // Handle invalid booking or ID not found
            return null;
        }
        return bookingRepository.save(booking);
    }

    @Override
    public BookingEnquiry updateBooking(BookingEnquiry booking) {
        if (booking.getBooking_enquiry_id() == null || !bookingRepository.existsById(booking.getBooking_enquiry_id())) {
            // Handle invalid booking or ID not found
            return null;
        }
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBooking(long bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    @Override
    public List<BookingEnquiry> saveBookings(List<BookingEnquiry> bookings) {
        return bookingRepository.saveAll(bookings);
    }

    @Override
    public List<BookingEnquiry> searchBookings(String searchTerm) {
        // Implement search logic using repository methods or custom query
        return bookingRepository.findByCustomerNameContainingOrBookingNumberContaining(searchTerm, searchTerm);
    }
}
