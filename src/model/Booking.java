package model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;

public class Booking {
    private String bookingNum;
    private String flightID;
    private String passengerID;
    private String tagNum;
    private String baggageNum;

    public Booking(String bookingNum, String flightID, String passengerID, String tagNum, String baggageNum) {
        this.bookingNum = bookingNum;
        this.flightID = flightID;
        this.passengerID = passengerID;
        this.tagNum = tagNum;
        this.baggageNum = baggageNum;
    }

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

//    public static void main(String[] args) {
//        ArrayList<Booking> arrayList = new ArrayList<>();
//        arrayList.add(new Booking("bk1", "flight1", "p1", "tag1", "bag1"));
//        arrayList.add(new Booking("bk2", "flight1", "p2", "tag2", "bag2"));
//        arrayList.add(new Booking("bk3", "flight2", "p3", "tag3", "bag3"));
//        arrayList.add(new Booking("bk4", "flight3", "p4", "tag4", "bag4"));
//        arrayList.add(new Booking("bk5", "flight3", "p5", "tag5", "bag5"));
//        JSONArray jsonArray = (JSONArray) JSON.toJSON(arrayList);
//        System.out.println(jsonArray);
//
//    }
}
