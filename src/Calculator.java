import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String choice = "";
		while(!"q".equals(choice)) {
								//System.out.println(!"q".equals(choice));
		System.out.println("Enter a choice( + - * / or q to quit): ");
		choice = scnr.next();
		if(choice.equals("q")) {
			System.out.println("exiting");
			break;
		}
								//System.out.println(!"q".equals(choice));
		System.out.println("Provide two inputs:");
		double result;
		double input1 = scnr.nextDouble();
		double input2 = scnr.nextDouble();
		
		if(choice.equals("+")) {
			result = input1 + input2;
			System.out.println("The answer is " + result);
			
		}
		else if(choice.equals("-")) {
			result = input1 - input2;
			System.out.println("The answer is " + result);
		}
		else if(choice.equals("*")) {
			result = input1 * input2;
			System.out.println("The answer is " + result);
		}
		else if (choice.equals("/")){
			if(input2 <= 0 ) {
				System.out.println("division by zero error");
			}
			else {
			result = input1 / input2;
			System.out.println("The answer is " + result);
			}
		}
		else {
			System.out.println("invalid choice");
		}
								//System.out.println(!"q".equals(choice));
		
	}
	}
}
