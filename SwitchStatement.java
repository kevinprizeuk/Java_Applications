import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print("Enter Name: ");
		name = scan.nextLine();
		
		System.out.print("Enter Score: ");
		score = scan.nextLine();
		
		switch(score/10){
			case 10:
			case 9:
					system.out.println(name + " your grade is Outstanding");
			break;
			
			case 8:
			case 7:
			case 6:
					system.out.println(name + " your grade is Excellent");
			break;
			
			case 5:
					system.out.println(name + " your grade is Good");
			break;
			
			case 4:
					system.out.println(name + " your grade is Average");
			break;

			case 3:
			case 2:
			case 1:
			case 0:
					System.out.println(name + " your grade very Poor");
			break;
			
			default:
				System.out.println("Invalid Grade");
			
			
		}
	}
}