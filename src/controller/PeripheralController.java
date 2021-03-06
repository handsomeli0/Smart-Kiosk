package controller;
import model.Booking;
import javax.swing.*;
import java.io.IOException;

/**
 * This class is used to manage peripherals.
 *
 * @author Minghan Li
 * @version 2.0
 */

public class PeripheralController {

    /**
     * Print boarding pass.
     *
     * @param bk booking information
     * @param classType class type
     * @param seat seat number
     * @throws IOException IOException
     */
    public static void printBoardingPass(Booking bk, int classType, int seat) throws IOException {
        String[] strs = new String[9];
        strs[0] = "Passenger Name: " + DataController.getNameByBooking(bk);
        strs[1] = "From: London";
        strs[2] = "To: " + DataController.getDestinationByBooking(bk);
        strs[3] = "Flight: " + bk.getFlightID();
        strs[4] = "Class: " + (classType == 0 ? "Economy" : "Business");
        strs[5] = "Seat: " + seat;
        strs[6] = "Gate: " + DataController.getGateByBooking(bk);
        strs[7] = "Date: " + DataController.getDateByBooking(bk);
        strs[8] = "Time "+ DataController.getTimeByBooking(bk);

        FileIOController.writeImage("Boarding-Pass", strs);
        JOptionPane.showMessageDialog(null, "Boarding Pass has been printed! Please find it in the folder \"peripherals\".");
    }

    /**
     * Print carry-on baggage tag.
     *
     * @param bk booking information
     * @throws IOException IOException
     */
    public static void printTag(Booking bk) throws IOException {
        String[] strs = new String[3];
        strs[0] = "Tag Number: " + bk.getTagNum();
        strs[1] = "Booking Number: " + bk.getBookingNum();
        strs[2] = "Passenger Name: " + DataController.getNameByBooking(bk);
        FileIOController.writeImage("Tag", strs);
        JOptionPane.showMessageDialog(null, "Baggage Tag has been printed! Please find it in the folder \"peripherals\".");

    }

    /**
     * Print baggage ticket.
     *
     * @param bk booking information
     * @throws IOException IOException
     */
    public static void printTicket(Booking bk) throws IOException {
        String[] strs = new String[4];
        strs[0] = "Ticket Number: " + bk.getTicketNum();
        strs[1] = "Booking Number: " + bk.getBookingNum();
        strs[2] = "Passenger Name: " + DataController.getNameByBooking(bk);
        strs[3] = "Bag Drop Counter Number: " + bk.getBagDropCounterNum();
        FileIOController.writeImage("Ticket", strs);
        JOptionPane.showMessageDialog(null, "Baggage Ticket has been printed! Please find it in the folder \"peripherals\".");

    }

    /**
     * Send check-in information to the back-end system(/Smart-Kiosk/peripherals/Check-In Information.csv)
     * @param bk booking information
     * @param seatlevel class of the seat
     * @param seatNum seat number
     * @param meal meal name
     * @param gourmet gourmet food name
     * @param price price of chosen extra options
     * @throws IOException IOException
     */
    public static void sendInformation(Booking bk, int seatlevel, int seatNum, String meal, String gourmet, String price) throws IOException {
        String classType = seatlevel == 0 ? "Economy" : "Business";
        String str = bk.getBookingNum() +","+ bk.getPassengerID() +","+ DataController.getNameByBooking(bk)+","+
                DataController.getPassByBooking(bk).getIdNum()+","+DataController.getPassByBooking(bk).getCreditCardID()
                +","+bk.getFlightID()+","+classType+","+seatNum+","+meal+",{"+gourmet+"},"+bk.getTagNum()+","
                +bk.getTicketNum()+","+bk.getBagDropCounterNum()+","+price;
        FileIOController.writeCSV("Check-In Information", str);
    }
}
