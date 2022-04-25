package controller;

import model.*;

import java.io.*;
import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

/**
 * This class is used to manage data.
 *
 * @author Minghan Li
 * @version 1.1
 */

public class DataController {
    // Store all the entities in array lists
    private static ArrayList<Booking> bookings;
    private static ArrayList<Flight> flights;
    private static ArrayList<Passenger> passengers;
    private static ArrayList<Meal> meals;
    private static IDdocument idDocument;

    // Initially read arraylists from JSON files
    static {
        try {
            bookings = (ArrayList<Booking>) JSON.parseArray(FileIOController.readJSON("Booking.json"), Booking.class);
            flights = (ArrayList<Flight>) JSON.parseArray(FileIOController.readJSON("Flight.json"), Flight.class);
            passengers = (ArrayList<Passenger>) JSON.parseArray(FileIOController.readJSON("Passenger.json"), Passenger.class);
            meals = (ArrayList<Meal>) JSON.parseArray(FileIOController.readJSON("Meal.json"), Meal.class);
            idDocument = (IDdocument) JSON.parseObject(FileIOController.readJSON("IDdocument.json"), IDdocument.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private DataController(){}



    // checkin

    /**
     * Get booking information by booking number
     * @param bookingNum booking number
     * @return booking
     */
    public static Booking getBookingByNum(String bookingNum) {
        for (Booking bk : bookings) {
            if (bk.getBookingNum().equals(bookingNum)) {
                return bk;
            }
        }
        return null;

    }

    /**
     * Get booking information by surname and ID number
     * @param surname surname of the passenger
     * @param IdNum ID number of the passenger
     * @return booking
     */
    public static Booking getBookingBySurnameIdNum(String surname, String IdNum) {
        for (Booking bk : bookings) {
            Passenger pass = getPassByBooking(bk);
            if (pass == null)
                continue;
            if (pass.getLastName().equals(surname) && pass.getIdNum().equals(IdNum)) {
                return bk;
            }
        }
        return null;
    }

    /**
     * Get passenger information by a booking
     * @param bk booking
     * @return passenger
     */
    public static Passenger getPassByBooking(Booking bk) {
        for (Passenger pass : passengers) {
            if (pass.getPassengerID().equals(bk.getPassengerID())) {
                return pass;
            }
        }
        return null;
    }

    /**
     * Get ID document
     * @return ID document
     */
    public static IDdocument getIDdocument() {
        return idDocument;
    }

    // summary

    /**
     * Get flight information by flight ID
     * @param flightID flight ID
     * @return flight
     */
    public static Flight getFlightByFlightID(String flightID) {
        for (Flight l : flights) {
            if (l.getFlightID().equals(flightID)) {
                return l;
            }
        }
        return null;
    }


    // meal

    /**
     * Get all meal information
     * @return an ArrayList of all meals
     */
    public static ArrayList<Meal> getAllMeals() {
        return DataController.meals;
    }
    // TODO: get Meals by type?

    // seat

    /**
     * Get seats information of one flight by flight ID
     * @param flightID flight ID
     * @return a boolean array representing whether the seats are ordered
     */
    public static boolean[] getSeatsByFlightID(String flightID) {
        for (Flight f : flights) {
            if (f.getFlightID().equals(flightID)) {
                return f.getSeat();
            }
        }

        return null;
    }

    /**
     * Update seat information if it is ordered
     * @param flightID flight ID
     * @param index index of the ordered seat in boolean array
     * @throws IOException IOException
     */
    public static void updateSeat(String flightID, int index) throws IOException {
        // change the seat to true
        DataController.getFlightByFlightID(flightID).getSeat()[index] = true;
        // write the new flights into json file
        FileIOController.writeJSON("./data/Flight.json", JSON.toJSONString(flights));
    }


    // payment

    /**
     * Check if the credit card ID is correct.
     * @param passengerID passenger ID
     * @param creditCardID credit card ID
     * @return if credit card ID is correct
     */
    public static boolean checkPayment(String passengerID, int creditCardID) {
        for (Passenger p : passengers) {
            if (p.getPassengerID().equals(passengerID)) {
                if (p.getCreditCardID() == creditCardID)
                    return true;
            }
        }
        return false;
    }
}
