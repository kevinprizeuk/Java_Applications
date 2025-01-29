import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] salaryRanges = new int[10]; // Array to count salaries in ranges
        double sales;
        int salary;

        for (int i = 0; i < 5; i++) { // Assuming 5 salespeople
            System.out.print("Enter gross sales for salesperson " + (i + 1) + ": ");
            sales = scanner.nextDouble();
            salary = (int) (200 + (0.09 * sales)); // Calculate salary

            // Determine the range
            if (salary >= 200 && salary < 300) salaryRanges[0]++;
            else if (salary >= 300 && salary < 400) salaryRanges[1]++;
            else if (salary >= 400 && salary < 500) salaryRanges[2]++;
            else if (salary >= 500 && salary < 600) salaryRanges[3]++;
            else if (salary >= 600 && salary < 700) salaryRanges[4]++;
            else if (salary >= 700 && salary < 800) salaryRanges[5]++;
            else if (salary >= 800 && salary < 900) salaryRanges[6]++;
            else if (salary >= 900 && salary < 1000) salaryRanges[7]++;
            else if (salary >= 1000) salaryRanges[8]++;
        }

        // Display results
        System.out.println("Salary Range\tCount");
        System.out.println("$200 - $299\t" + salaryRanges[0]);
        System.out.println("$300 - $399\t" + salaryRanges[1]);
        System.out.println("$400 - $499\t" + salaryRanges[2]);
        System.out.println("$500 - $599\t" + salaryRanges[3]);
        System.out.println("$600 - $699\t" + salaryRanges[4]);
        System.out.println("$700 - $799\t" + salaryRanges[5]);
        System.out.println("$800 - $899\t" + salaryRanges[6]);
        System.out.println("$900 - $999\t" + salaryRanges[7]);
        System.out.println("$1000 and over\t" + salaryRanges[8]);
    }
}