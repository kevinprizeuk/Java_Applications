import java.util.Scanner;

public class DoWhileLoop{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		static int score;
		int SumOfScore = 0;
		double average;
		int i = 1;
		
		do{
		System.out.print("Enter Score: ");
		score = scan.nextInt();
			
		SumOfScore += score;
		i++;
		}while(i <= 10);
		
		average = (double)SumOfScore/10;
		System.out.print("The Average Score is " + average);
	}
}