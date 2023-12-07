import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) {
		System.out.println("Press 1 for circle press 2 for pyramid");
		Scanner scnr = new Scanner(System.in);
		int choice = scnr.nextInt();
		if(choice == 1) {
			Calculate_circle(scnr);
		}
		else if(choice == 2) {
			Calculate_pyramid(scnr);
		}
		else {
			System.out.println("not a correct input");
		}
	}
	public static void Calculate_circle(Scanner scnr) {
		System.out.println("Type the radius");
		double radius = scnr.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area is: " + area);
	
	}
	public static void Calculate_pyramid(Scanner scnr) {
		System.out.println("Input the length width and height");
		double length = scnr.nextDouble();
		double width = scnr.nextDouble();
		double height = scnr.nextDouble();
		double volume =  (length * width * height)/3;
		double baseArea = length * width;
		System.out.println("Area is: "+ baseArea);
		System.out.println("Volue is: "+ volume);
		
	}

}
