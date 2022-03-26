package model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;

public class Flight {
    private String flightID;
    private String destination;
    private double price;
    private String gate;
    private String date;
    private String boardingTime;
    private boolean[] seat;

    public Flight(String flightID, String destination, double price, String gate, String date, String boardingTime) {
        this.flightID = flightID;
        this.destination = destination;
        this.price = price;
        this.gate = gate;
        this.date = date;
        this.boardingTime = boardingTime;
        this.seat = new boolean[32];
    }

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

//    public static void main(String[] args) {
//        ArrayList<Flight> arrayList = new ArrayList<>();
//        arrayList.add(new Flight("flight1", "Beijing", 998, "1", "2022-03-25", "08:00"));
//        arrayList.add(new Flight("flight2", "Shanghai", 999.8, "2", "2022-03-29", "16:35"));
//        arrayList.add(new Flight("flight3", "Guangzhou", 1999.98, "3", "2022-05-04", "21:10"));
//        JSONArray jsonArray = (JSONArray) JSON.toJSON(arrayList);
//        System.out.println(jsonArray);
//    }
}