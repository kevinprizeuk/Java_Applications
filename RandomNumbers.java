import java.util.Random;

public class RandomNumbers{
	public static void main(String args[]){
		Random random =  new Random ();
		
		//create a variable to store a random number generated
		int randomNum = random.nextInt ();
		
		//print your random number
		System.out.printf("Random Number is : %d%n", randomNum);
		
		//generating a number within a range
		int randomNumInRange =  random.nextInt(20) + 1;
		
		System.out.printf("Random Number in Range is : %d%n", randomNumInRange);
		
		//generating a float-point number
		double floatpointNum = random.nextDouble();
		
		//print
		System.out.printf("Random Double Number is: %.2f%n", floatpointNum);
		
		//Generating a float-point value within a range
		
		double min = 10.0;
		double max = 20.0;
		
		double randomFloatPointInRange = min + (max-min)* random,nextDouble(); 
	}
}