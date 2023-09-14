package hw6IfElseCondition02;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Today's Weather");
		
		Scanner scanner = new Scanner(System.in);
		
		int todaysTemperature = scanner.nextInt();
		
		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		}else if (todaysTemperature < 55) {
			System.out.println("Pleasant");
		}else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		}else if (todaysTemperature > 101) {
			System.out.println("Very Hot");
		}else {
			System.out.println("Please enter a valid temperature");
		}
		
		scanner.close();

	}

}
