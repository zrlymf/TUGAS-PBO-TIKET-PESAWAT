public class Ticket {
    private String passengerName;
    private String flightNumber;
    private double baseFare;

    public Ticket(String passengerName, String flightNumber, double baseFare) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.baseFare = baseFare;
    }
    public double calculateFare() {
        return baseFare;
    }
    public String getFacilities() {
        return "Basic facilities available for all passengers.";
    }
    public String getPassengerName() {
        return passengerName;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public double getBaseFare() {
        return baseFare;
    }
    public void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Total Fare: " + calculateFare());
        System.out.println("Facilities: " + getFacilities());
    }
}
