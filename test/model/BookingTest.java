package model;

import controller.DataController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    @Test
    void BookingTest() {
        Booking bk = DataController.getBookingByNum("bk1");
        assertEquals(bk.getBookingNum(), "bk1");
        assertEquals(bk.getPassengerID(), "p1");
        assertEquals(bk.getFlightID(), "flight1");
        assertFalse(bk.getFinished());
        assertEquals(bk.getTagNum(), "tag10001");
        assertEquals(bk.getBagDropCounterNum(), "1");
        assertEquals(bk.getTicketNum(), "ticket10001");
    }
}