package ifelsecondition;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
		//and displays the name of the weekday

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter number between 1 to 7 : ");
	    int a = input.nextInt();
	    
	   switch(a)
	   {
	   case 1: 	    System.out.println("Sunday");
	   				break;
	   case 2: 	    System.out.println("Monday");
					break;
	   case 3: 	    System.out.println("Tuesday");
					break;
	   case 4: 	    System.out.println("Wednesday");
					break;
	   case 5: 	    System.out.println("Thursday");
	   				break;
	   case 6: 	    System.out.println("Friday");
	   				break;
	   case 7: 	    System.out.println("Saturday");
	   				break;
	   default: 	System.out.println("Invalid number");
	   				break;





	   }
	    
	}

}
