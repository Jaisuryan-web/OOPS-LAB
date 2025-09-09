// File: MovieTicketBooking.java
import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    
    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
    }
    
    void displayTicket() {
        System.out.println("Movie: " + movieName + " | Seat: " + seatNumber + " | Price: $" + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] seats = new boolean[5]; // 5 seats for simplicity
        
        System.out.println("=== QUICK TICKET BOOKING ===");
        
        // Get movie name
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();
        
        // Get seat number
        System.out.print("Enter seat number (1-5): ");
        int seatNumber = scanner.nextInt();
        
        // Check if seat is available
        if (seatNumber >= 1 && seatNumber <= 5) {
            if (!seats[seatNumber - 1]) {
                seats[seatNumber - 1] = true; // Mark seat as taken
                
                // Create and book ticket
                MovieTicket ticket = new MovieTicket();
                ticket.bookTicket(movieName, seatNumber, 12.0); // Fixed price $12
                
                // Display ticket
                System.out.println("\nTicket Booked!");
                ticket.displayTicket();
            } else {
                System.out.println("Seat already taken!");
            }
        } else {
            System.out.println("Invalid seat number!");
        }
        
        scanner.close();
    }
}
