package model;

import controller.DataController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PassengerTest {
    @Test
    void passengerTest() {
        Passenger p = DataController.getPassByBooking(DataController.getBookingByNum("bk1"));
        assertEquals(p.getPassengerID(), "p1");
        assertEquals(p.getIdNum(), "id01");
        assertEquals(p.getCreditCardID(), 100001);
        assertEquals(p.getFirstName(), "Tom");
        assertEquals(p.getLastName(), "Bliboo");
    }

}