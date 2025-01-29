import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        int[][] sales = new int[4][5]; // 4 salespeople, 5 products
        Scanner scanner = new Scanner(System.in);

        // Input sales data
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter sales for salesperson " + (i + 1) + " for product " + (j + 1) + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }

        // Display sales summary
        System.out.println("\nSales Summary:");
        System.out.print("\t");
        for (int i = 0; i < 4; i++) {
            System.out.print("Salesperson " + (i + 1) + "\t");
        }
        System.out.println("Total");

        for (int j = 0; j < 5; j++) {
            System.out.print("Product " + (j + 1) + "\t");
            int productTotal = 0;
            for (int i = 0; i < 4; i++) {
                System.out.print(sales[i][j] + "\t\t");
                productTotal += sales[i][j];
            }
            System.out.println(productTotal);
        }

        // Cross-totals
        System.out.print("Total\t");
        for (int i = 0; i < 4; i++) {
            int salespersonTotal = 0;
            for (int j = 0; j < 5; j++) {
                salespersonTotal += sales[i][j];
            }
            System.out.print(salespersonTotal + "\t\t");
        }
    }
}