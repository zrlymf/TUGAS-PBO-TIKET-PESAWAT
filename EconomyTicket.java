public class EconomyTicket extends Ticket {
    private final double BAGGAGE_LIMIT = 20; // in kg

    public EconomyTicket(String passengerName, String flightNumber, double baseFare) {
        super(passengerName, flightNumber, baseFare);
    }

    @Override
    public double calculateFare() {
        return super.getBaseFare() * 0.90; // 10% discount
    }

    @Override
    public String getFacilities() {
        return "Baggage limit: " + BAGGAGE_LIMIT + " kg. Complimentary water.";
    }
}
