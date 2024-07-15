 import java.util.Scanner;

public class Factorial{

  	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int userInput = input.nextInt();
				 
		int factorial = Kata.factorial(userInput); 
		System.out.println("factorial is " + factorial);


	}
}




