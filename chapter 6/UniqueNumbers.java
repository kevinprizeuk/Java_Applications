import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number between 10 and 100: ");
            int number = scanner.nextInt();

            if (number >= 10 && number <= 100) {
                boolean isDuplicate = false;
                for (int i = 0; i < count; i++) {
                    if (uniqueNumbers[i] == number) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    uniqueNumbers[count] = number;
                    count++;
                    System.out.println("Unique numbers so far: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(uniqueNumbers[i] + " ");
                    }
                    System.out.println();
                }
            }   else {
                System.out.println("Number out of range. Please try again.");
            }
        }
    }
}