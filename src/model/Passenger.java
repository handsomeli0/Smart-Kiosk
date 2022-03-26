package model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;

public class Passenger {
    private String passengerID;
    private String firstName;
    private String lastName;
    private String idNum;
    private int creditCardID;

    public Passenger(String passengerID, String firstName, String lastName, String idNum, int creditCardID) {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.creditCardID = creditCardID;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(int creditCardID) {
        this.creditCardID = creditCardID;
    }

//    public static void main(String[] args) {
//        ArrayList<Passenger> arrayList = new ArrayList<Passenger>();
//        arrayList.add(new Passenger("p1", "Tom", "Bliboo", "id01", 100001));
//        arrayList.add(new Passenger("p2", "Makka", "Pakka", "id02", 100002));
//        arrayList.add(new Passenger("p3", "Upsy", "Daisy", "id03", 100003));
//        arrayList.add(new Passenger("p4", "Iggle", "Piggle", "id04", 100004));
//        JSONArray jsonArrays = (JSONArray) JSON.toJSON(arrayList);
//        System.out.println(jsonArrays);
//    }
}
