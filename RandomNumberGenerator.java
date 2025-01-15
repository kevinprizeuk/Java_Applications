import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator{
	public static void main(string args[]) {
		Scanner scan = new Scanner(system.in);
		Random random = new Random();
		
		System.out.print("Enter the upper limit of the number you want to generate: ");
		int upperlimit = scan.nextInt();
		
		if(upperlimit == 0){
			System.out.println("The number must be greater than 0");
		}
		else{
			int randomNum = random.nextInt(upperlimit) + 1;
			system.out.printf("The generate random number from 0 - %d is: %d%n",upperlimit,randomNum);
		}
	}
}