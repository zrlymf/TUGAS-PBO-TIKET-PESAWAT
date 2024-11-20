public class BusinessTicket extends Ticket {
    private final double BAGGAGE_LIMIT = 40; // in kg
    private final String MEAL_SERVICE = "Gourmet meal service";

    public BusinessTicket(String passengerName, String flightNumber, double baseFare) {
        super(passengerName, flightNumber, baseFare);
    }

    @Override
    public double calculateFare() {
        return super.getBaseFare() * 1.25; // 25% extra charge
    }

    @Override
    public String getFacilities() {
        return "Baggage limit: " + BAGGAGE_LIMIT + " kg. Facilities include: " + MEAL_SERVICE + ", priority check-in.";
    }
}
