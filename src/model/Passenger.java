package model;

/**
 * This is the entity class of passenger
 * @author Minghan Li
 * @version 1.1
 */
public class Passenger {
    private String passengerID;
    private String firstName;
    private String lastName;
    private String idNum;
    private int creditCardID;

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

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID='" + passengerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNum='" + idNum + '\'' +
                ", creditCardID=" + creditCardID +
                '}';
    }
}
