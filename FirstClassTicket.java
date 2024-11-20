public class FirstClassTicket extends Ticket {
    private final double BAGGAGE_LIMIT = 60; // in kg
    private final String LOUNGE_ACCESS = "Access to VIP Lounge";
    private final String PREMIUM_SERVICE = "Dedicated cabin crew and luxury seats";

    public FirstClassTicket(String passengerName, String flightNumber, double baseFare) {
        super(passengerName, flightNumber, baseFare);
    }

    @Override
    public double calculateFare() {
        return super.getBaseFare() * 1.50; // 50% extra charge
    }

    @Override
    public String getFacilities() {
        return "Baggage limit: " + BAGGAGE_LIMIT + " kg. Facilities include: " + LOUNGE_ACCESS + ", " + PREMIUM_SERVICE + ".";
    }
}
