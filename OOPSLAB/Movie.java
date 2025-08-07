// File: MovieTicketBooking.java

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
    }

    // Method to display ticket info
    void displayTicket() {
        System.out.println(" Movie Name  : " + movieName);
        System.out.println(" Seat Number : " + seatNumber);
        System.out.println(" Ticket Price: $" + price);
    }
}

public class Movie{
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();

        // Booking the ticket
        ticket1.bookTicket("Inception", 32, 12);

        // Displaying ticket details
        ticket1.displayTicket();

}
}
