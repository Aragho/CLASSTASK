import java.util.Scanner;
public class MinimumAndMaximum {
public static void main(String[]args)  {

Scanner input = new Scanner (System.in);

System.out.print(" Enter ten integers: ");
int integer = input.nextInt();

int minimumNumber = 0;
int maximumNumber = 0;
int number = 0;

while(number != -1) {

   if(number <=   minimumNumber) {
       minimumNumber = number;
   }

   if(number > maximumNumber) {
   	maximumNumber = number;
   }

  	System.out.print(" Enter ten integers : ");
   	number = input.nextInt();


}

  	System.out.println("MinimumNumber is" + minimumNumber);
  	System.out.println("MaximumNumber is " + maximumNumber);
}
}