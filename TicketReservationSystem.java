import java.util.ArrayList;
import java.util.Scanner;

public class TicketReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        System.out.println("Welcome to the Ticket Reservation System!");
        while (true) {
            System.out.println("\nEnter passenger name:");
            String name = scanner.nextLine();

            System.out.println("Enter flight number:");
            String flightNumber = scanner.nextLine();

            System.out.println("Enter base fare:");
            double baseFare = scanner.nextDouble();
            scanner.nextLine(); // Clear the newline

            System.out.println("Select ticket type:");
            System.out.println("1. Economy");
            System.out.println("2. Business");
            System.out.println("3. First Class");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            Ticket ticket = null;

            switch (choice) {
                case 1:
                    ticket = new EconomyTicket(name, flightNumber, baseFare);
                    break;
                case 2:
                    ticket = new BusinessTicket(name, flightNumber, baseFare);
                    break;
                case 3:
                    ticket = new FirstClassTicket(name, flightNumber, baseFare);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            tickets.add(ticket);

            System.out.println("Do you want to add another ticket? (yes/no)");
            String continueInput = scanner.nextLine();
            if (!continueInput.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("\n--- Ticket Details ---");
        for (Ticket t : tickets) {
            t.displayTicketDetails();
            System.out.println();
        }

        scanner.close();
    }
}
