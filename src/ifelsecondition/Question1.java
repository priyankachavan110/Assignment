package ifelsecondition;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Take three numbers from the user and print the greatest number ?
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter 1st number: ");
	    int a = input.nextInt();
	    System.out.println("Enter 2nd number: ");
	    int b = input.nextInt();
	  	System.out.println("Enter 3rd number: ");
	    int c = input.nextInt();
	    
	    if(a>b && a>c)
	    {
		    System.out.println("Greatest number: "+ a);

	    }
	    else if(b>a && b>c)
	    {
		    System.out.println("Greatest number: "+ b);
	    }
	    else if(c>b && c>a)
	    {
		    System.out.println("Greatest number: "+ c);

	    }
	    else
	    {
		    System.out.println("Entered numbers are equal");
	    }
	    
	}

}
