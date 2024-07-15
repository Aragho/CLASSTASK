import java.util.Scanner;

public class SumOfEven{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);

		int score = 0;
		int even = 0;
		int odd = 0;
		

	for( int number = 1; number <=10; number++){
		even += score;
		odd += score;

	System.out.println("Enter ten scores: ");
		 number = input.nextInt();


			
		if( number % 2 == 0){
			System.out.println("even is " + number);
		}

		else{
			System.out.println("odd is " + number);
		}


	}


	}




}