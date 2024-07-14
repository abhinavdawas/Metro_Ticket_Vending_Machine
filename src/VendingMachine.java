import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    private List<Route> routes;
    private List<Ticket> purchasedTickets;

    public VendingMachine() {
        this.routes = new ArrayList<>();
        this.purchasedTickets = new ArrayList<>();
        initializeRoutes();
    }

    private void initializeRoutes() {
        // Route 1
        List<MetroStation> route1Stations = new ArrayList<>();
        route1Stations.add(new MetroStation("Station A", "A"));
        route1Stations.add(new MetroStation("Station B", "B"));
        route1Stations.add(new MetroStation("Station C", "C"));
        routes.add(new Route("Route 1", route1Stations));

        // Route 2
        List<MetroStation> route2Stations = new ArrayList<>();
        route2Stations.add(new MetroStation("Station D", "D"));
        route2Stations.add(new MetroStation("Station E", "E"));
        route2Stations.add(new MetroStation("Station F", "F"));
        route2Stations.add(new MetroStation("Station G", "G"));
        routes.add(new Route("Route 2", route2Stations));
    }

    public void displayRoutes() {
        System.out.println("Available Routes:");
        for (Route route : routes) {
            System.out.println(route);
        }
    }

    public Route getRouteByName(String routeName) {
        for (Route route : routes) {
            if (route.getName().equalsIgnoreCase(routeName)) {
                return route;
            }
        }
        return null;
    }

    public void purchaseTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the route name for which you want to purchase a ticket:");
        String routeName = scanner.nextLine();
        Route selectedRoute = getRouteByName(routeName);

        if (selectedRoute == null) {
            System.out.println("Invalid route name.");
            return;
        }

        System.out.println("Select ticket type:");
        System.out.println("1. Single Ride");
        System.out.println("2. Return");
        System.out.println("3. Weekly Pass");
        System.out.println("4. Monthly Pass");
        int ticketTypeChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String ticketType;
        switch (ticketTypeChoice) {
            case 1:
                ticketType = "Single Ride";
                break;
            case 2:
                ticketType = "Return";
                break;
            case 3:
                ticketType = "Weekly Pass";
                break;
            case 4:
                ticketType = "Monthly Pass";
                break;
            default:
                System.out.println("Invalid ticket type.");
                return;
        }

        System.out.println("Is it peak hours? (yes/no):");
        String isPeakHoursStr = scanner.nextLine();
        boolean isPeakHours = isPeakHoursStr.equalsIgnoreCase("yes");

        double fare = calculateFare(selectedRoute, ticketType, isPeakHours);
        System.out.println("The fare for a " + ticketType + " ticket on " + selectedRoute.getName() +
                " during " + (isPeakHours ? "peak" : "off-peak") + " hours is $" + fare + ".");
        System.out.println("Do you want to purchase this ticket? (yes/no):");
        String purchaseConfirmation = scanner.nextLine();

        if (purchaseConfirmation.equalsIgnoreCase("yes")) {
            Ticket ticket = new Ticket(selectedRoute, ticketType, fare);
            purchasedTickets.add(ticket);
            System.out.println("Ticket purchased successfully!");
            System.out.println(ticket);
        }
    }

    public double calculateFare(Route route, String ticketType, boolean isPeakHours) {
        double baseFare = 2.0; // Example base fare
        double peakMultiplier = 1.5;
        double ticketTypeMultiplier;

        switch (ticketType) {
            case "Single Ride":
                ticketTypeMultiplier = 1.0;
                break;
            case "Return":
                ticketTypeMultiplier = 1.8;
                break;
            case "Weekly Pass":
                ticketTypeMultiplier = 10.0;
                break;
            case "Monthly Pass":
                ticketTypeMultiplier = 30.0;
                break;
            default:
                ticketTypeMultiplier = 1.0;
        }

        double fare = baseFare * ticketTypeMultiplier;
        if (isPeakHours) {
            fare *= peakMultiplier;
        }

        return fare;
    }

    public void viewPurchasedTickets() {
        System.out.println("Purchased Tickets:");
        for (Ticket ticket : purchasedTickets) {
            System.out.println(ticket);
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Metro Ticket Vending Machine!");
            System.out.println("Please select an option:");
            System.out.println("1. View All Routes");
            System.out.println("2. Purchase Ticket");
            System.out.println("3. View Purchased Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayRoutes();
                    break;
                case 2:
                    purchaseTicket();
                    break;
                case 3:
                    viewPurchasedTickets();
                    break;
                case 4:
                    System.out.println("Thank you for using the Metro Ticket Vending Machine! Goodbye.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Press Enter to return to the main menu.");
            scanner.nextLine(); // wait for Enter key press
        }
    }
}
