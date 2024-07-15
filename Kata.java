
public class Kata{

	public static int factorial(int userInput){

		
			int factorial = 1;
					
			for(int index = 1; index <= userInput; index++){
			 factorial *= index;
		    	}
				return factorial;

	}  

}