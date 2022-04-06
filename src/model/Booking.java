package model;

/**
 * This is the entity class of booking
 * @author Minghan Li
 * @version 1.1
 */
public class Booking {
    private String bookingNum;
    private String flightID;
    private String passengerID;
    private String tagNum;
    private String baggageNum;

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

    public String getBaggageNum() {
        return baggageNum;
    }

    public void setBaggageNum(String baggageNum) {
        this.baggageNum = baggageNum;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNum='" + bookingNum + '\'' +
                ", flightID='" + flightID + '\'' +
                ", passengerID='" + passengerID + '\'' +
                ", tagNum='" + tagNum + '\'' +
                ", baggageNum='" + baggageNum + '\'' +
                '}';
    }
}
