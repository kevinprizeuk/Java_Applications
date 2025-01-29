public class ProductCalculator {
    public static void main(String[] args) {
        System.out.println("Product of 2, 3, 4: " + product(2, 3, 4));
        System.out.println("Product of 1, 5, 6, 7: " + product(1, 5, 6, 7));
        System.out.println("Product of 3: " + product(3));
    }

    public static int product(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}