package model;

import com.alibaba.fastjson.*;

import java.util.ArrayList;

/**
 * This is the entity class of booking
 * @author Minghan Li
 * @version 2.0
 */
public class Booking {
    private String bookingNum;
    private String flightID;
    private String passengerID;
    private String tagNum;
    private String ticketNum;
    private String bagDropCounterNum;

    public String getBookingNum() {
        return bookingNum;
    }

    public void setBookingNum(String bookingNum) {
        this.bookingNum = bookingNum;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getTagNum() {
        return tagNum;
    }

    public void setTagNum(String tagNum) {
        this.tagNum = tagNum;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getBagDropCounterNum() {
        return bagDropCounterNum;
    }

    public void setBagDropCounterNum(String bagDropCounterNum) {
        this.bagDropCounterNum = bagDropCounterNum;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNum='" + bookingNum + '\'' +
                ", flightID='" + flightID + '\'' +
                ", passengerID='" + passengerID + '\'' +
                ", tagNum='" + tagNum + '\'' +
                ", ticketNum='" + ticketNum + '\'' +
                ", bagDropCounterNum='" + bagDropCounterNum + '\'' +
                '}';
    }
}
