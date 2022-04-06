package model;

import java.util.Arrays;

/**
 * This is the entity class of flight.
 * @author Minghan Li
 * @version 1.1
 */
public class Flight {
    private String flightID;
    private String destination;
    private double price;
    private String gate;
    private String date;
    private String boardingTime;
    private boolean[] seat;

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public boolean[] getSeat() {
        return seat;
    }

    public void setSeat(boolean[] seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", gate='" + gate + '\'' +
                ", date='" + date + '\'' +
                ", boardingTime='" + boardingTime + '\'' +
                ", seat=" + Arrays.toString(seat) +
                '}';
    }
