import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int[] frequency = new int[13]; // Index 0-1 will not be used
        Random random = new Random();

        for (int i = 0; i < 36000000; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            frequency[sum]++;
        }

        System.out.println("Sum\tFrequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.println(sum + "\t" + frequency[sum]);
        }
    }
}