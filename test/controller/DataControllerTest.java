package controller;

import model.Booking;
import model.Meal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


class DataControllerTest {
    @Test
    void DataControllerTest() {
        Booking bk = DataController.getBookingByNum("bk1");
        assertEquals(bk.getBookingNum(), "bk1");
        assertEquals(DataController.getNameByBooking(bk), "");

        bk = DataController.getBookingByNum("bk2");
        assertEquals(bk.getFlightID(), "flight1");

        bk = DataController.getBookingBySurnameIdNum("Pakka", "id02");
        assertEquals(DataController.getPassByBooking(bk).getLastName(), "Pakka");
        assertEquals(DataController.getPassByBooking(bk).getIdNum(), "id02");

        bk = DataController.getBookingBySurnameIdNum("Bliboo", "id01");
        assertEquals(DataController.getPassByBooking(bk).getLastName(), "Bliboo");
        assertEquals(DataController.getPassByBooking(bk).getIdNum(), "id01");


        assertFalse(DataController.checkPayment("p1", 1232313));
        assertTrue(DataController.checkPayment("p1", 100001));
        assertFalse(DataController.checkPayment("p2", 0));
        assertFalse(DataController.checkPayment("p2", 999999999));
        assertFalse(DataController.checkPayment("p2", 100001));
        assertTrue(DataController.checkPayment("p2", 100002));

    }

}