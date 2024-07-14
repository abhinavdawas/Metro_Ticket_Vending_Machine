import java.time.LocalDateTime;

public class Ticket {
    private static int ticketCounter = 0;
    private int id;
    private Route route;
    private String ticketType;
    private double fare;
    private LocalDateTime purchaseTime;

    public Ticket(Route route, String ticketType, double fare) {
        this.id = ++ticketCounter;
        this.route = route;
        this.ticketType = ticketType;
        this.fare = fare;
        this.purchaseTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public Route getRoute() {
        return route;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getFare() {
        return fare;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Route: " + route.getName() + ", Ticket Type: " + ticketType +
                ", Fare: $" + fare + ", Purchase Time: " + purchaseTime;
    }
}
