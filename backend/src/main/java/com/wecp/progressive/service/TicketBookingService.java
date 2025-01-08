package com.wecp.progressive.service;

import com.wecp.progressive.entity.TicketBooking;

import java.util.List;

public interface TicketBookingService {
    List<TicketBooking> getAllTicketBookings();

    int createBooking(TicketBooking ticketBooking);

    void cancelBooking(int bookingId);

    List<TicketBooking> getBookingsByUserEmail(String email);

<<<<<<< HEAD
}
=======
}
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
