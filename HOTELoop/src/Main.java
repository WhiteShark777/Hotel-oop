import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(new StandardRoom());
        hotel.addRoom(new StandardRoom());

        Receptionist receptionist = new Receptionist();
        hotel.addObserver(receptionist);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (book, cancel, check, quit):");
            String command = scanner.nextLine();
            switch (command) {
                case "book":
                    System.out.println("Enter room number to book:");
                    int bookIndex = scanner.nextInt();
                    scanner.nextLine();
                    hotel.bookRoom(bookIndex);
                    break;
                case "cancel":
                    System.out.println("Enter room number to cancel booking:");
                    int cancelIndex = scanner.nextInt();
                    scanner.nextLine();
                    hotel.cancelBooking(cancelIndex);
                    break;
                case "check":
                    hotel.checkAvailability();
                    break;
                case "quit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Please enter again.");
            }
        }
    }
}
