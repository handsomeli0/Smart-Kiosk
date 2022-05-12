package controller;

import model.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

/**
 * This class is used to manage data.
 *
 * @author Minghan Li
 * @version 2.0
 */

public class DataController {
    // Store all the entities in array lists
    private static ArrayList<Booking> bookings;
    private static ArrayList<Flight> flights;
    private static ArrayList<Passenger> passengers;
    private static ArrayList<Meal> meals;
    private static IDdocument idDocument;
    private static ArrayList<GourmetFood> gourmetFoods;

    // Initially read arraylists from JSON files
    static {
        try {
            bookings = (ArrayList<Booking>) JSON.parseArray(FileIOController.readJSON("Booking.json"), Booking.class);
            flights = (ArrayList<Flight>) JSON.parseArray(FileIOController.readJSON("Flight.json"), Flight.class);
            passengers = (ArrayList<Passenger>) JSON.parseArray(FileIOController.readJSON("Passenger.json"), Passenger.class);
            meals = (ArrayList<Meal>) JSON.parseArray(FileIOController.readJSON("Meal.json"), Meal.class);
            idDocument = (IDdocument) JSON.parseObject(FileIOController.readJSON("IDdocument.json"), IDdocument.class);
            gourmetFoods = (ArrayList<GourmetFood>) JSON.parseArray(FileIOController.readJSON("GourmetFood.json"),GourmetFood.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private DataController(){}

    /**
     * Create a BufferedImage with strs shown on it.
     *
     * @param strs Strings to be shown.
     * @return BufferedImage
     */
    public static BufferedImage createImage(String[] strs) {
        // set size
        int width = 600, height = 400;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        // padding
        graphics.fillRect(0, 0, width, height);
        // font size, color
        graphics.setFont(new Font("Arial", Font.BOLD, 20));
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < strs.length; i++) {
            graphics.drawString(strs[i], 150, 70 + (i + 1) * 30);
        }
        graphics.dispose();
        return image;
    }



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

    public static GourmetFood getGourmetFood(int num)
    {
        return gourmetFoods.get(num);
    }

    public static Meal getMeal(int num){return meals.get(num);}

    public static void addCount (int num) throws IOException{
        DataController.gourmetFoods.get(num).setCount(DataController.gourmetFoods.get(num).getCount()+1);
        FileIOController.writeJSON("./data/GourmetFood.json", JSON.toJSONString(gourmetFoods));
    }

    public static void setCountToNull () throws IOException{
        for(int i = 0; i<gourmetFoods.size(); i++) {
            DataController.gourmetFoods.get(i).setCount(0);
        }
        FileIOController.writeJSON("./data/GourmetFood.json", JSON.toJSONString(gourmetFoods));
    }

    public static String showGourmetFood() throws  IOException{
        ArrayList<String> gf = new ArrayList<>();
        for(int i = 0; i<gourmetFoods.size();i++) {
            if(DataController.gourmetFoods.get(i).getCount()!=0){
                    gf.add(DataController.gourmetFoods.get(i).getDescription());
                    gf.add(", x");
                    int a = DataController.gourmetFoods.get(i).getCount();
                    String b = String.valueOf(a);
                    gf.add(b);
                    gf.add("; ");
            }
        }
        String PurchasedFood = "";
        for (String fruit : gf) {
            PurchasedFood+=fruit + "\n";
        }
        return PurchasedFood;
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

    // print

    /**
     * Get passenger name by booking information
     *
     * @param bk booking
     * @return passenger name
     */
    public static String getNameByBooking(Booking bk) {
        for (Passenger p : passengers) {
            if (p.getPassengerID().equals(bk.getPassengerID())) {
                return p.getFirstName() + " " + p.getLastName();
            }
        }
        return null;
    }

    /**
     * Get destination by booking information.
     *
     * @param bk booking
     * @return destination
     */
    public static String getDestinationByBooking(Booking bk) {
        for (Flight flight : flights) {
            if (flight.getFlightID().equals(bk.getFlightID())) {
                return flight.getDestination();
            }
        }
        return null;
    }

    /**
     * Get gate number by booking information
     *
     * @param bk booking
     * @return gate
     */
    public static String getGateByBooking(Booking bk) {
        for (Flight flight : flights) {
            if (flight.getFlightID().equals(bk.getFlightID())) {
                return flight.getGate();
            }
        }
        return null;
    }

    /**
     * Get date of flight by booking information
     *
     * @param bk booking
     * @return date
     */
    public static String getDateByBooking(Booking bk) {
        for (Flight flight : flights) {
            if (flight.getFlightID().equals(bk.getFlightID())) {
                return flight.getDate();
            }
        }
        return null;
    }

    /**
     * Get boarding time by booking information
     *
     * @param bk booking
     * @return boarding time
     */
    public static String getTimeByBooking(Booking bk) {
        for (Flight flight : flights) {
            if (flight.getFlightID().equals(bk.getFlightID())) {
                return flight.getBoardingTime();
            }
        }
        return null;
    }
}
