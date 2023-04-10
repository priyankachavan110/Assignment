package arithmaticOperators;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Write a Java program that accepts two integers from the user and then prints the sum, the difference, 
		//the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), 
		//the minimum (smaller of the two integers).
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter 1st number: ");
	    int a = input.nextInt();
	    System.out.println("Enter 2nd number: ");
	    int b = input.nextInt();
	     
	    //int sum = a+b;
	    System.out.println("Sum of two numbers: " + (a+b));
	    System.out.println("Difference of two numbers: " + (a-b));
	    System.out.println("Product of two numbers: " + (a*b));
	    System.out.println("Average of two numbers: " + ((a+b)/2));
	    
	    if(a>b)
	    {
		    System.out.println("maximum (the larger of the two integers) :"+ a);
		    System.out.println(" minimum (smaller of the two integers) :"+ b);
	    }
	    else
	    {
		    System.out.println("maximum (the larger of the two integers) :"+ b);
		    System.out.println(" minimum (smaller of the two integers) :"+ a);

	    }
	    
}

}
