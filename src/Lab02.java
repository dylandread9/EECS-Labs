import java.util.Scanner;

public class Lab02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int age = scnr.nextInt();
		int weight = scnr.nextInt();
		int heartRate = scnr.nextInt();
		int time = scnr.nextInt();
		double yourValue = ((age * .2757) + (weight * .03295) + (heartRate * 1.0781) - 75.4991) * time / 8.368;
		System.out.printf("Calories: %.2f calories\n", yourValue);
	}

}
