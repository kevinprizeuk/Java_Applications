import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10]; // 10 seats
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please type 1 for First Class or 2 for Economy: ");
            int choice = scanner.nextInt();

            int seatNumber = -1;
            if (choice == 1) {
                seatNumber = assignSeat(seats, 0, 5); // First Class
            } else if (choice == 2) {
                seatNumber = assignSeat(seats, 5, 10); // Economy
            }

            if (seatNumber == -1) {
                System.out.println("No seats available in the selected section.");
                System.out.print("Would you like to be placed in the other section? (yes=1/no=0): ");
                int response = scanner.nextInt();
                if (response == 1) {
                    if (choice == 1) {
                        seatNumber = assignSeat(seats, 5, 10); // Try Economy
                    } else {
                        seatNumber = assignSeat(seats, 0, 5); // Try First Class
                    }
                }
            }

            if (seatNumber != -1) {
                System.out.println("Your seat number is: " + (seatNumber + 1));
                System.out.println("Boarding pass issued.");
                seats[seatNumber] = true; // Mark seat as taken
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }

    private static int assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i < end; i++) {
            if (!seats[i]) {
                return i; // Return the first available seat
            }
        }
        return -1; // No seats available
    }
}