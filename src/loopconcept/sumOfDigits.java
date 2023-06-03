package loopconcept;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter number: ");
	    int a = input.nextInt();
	    int sum=0;
	    while(a%10>0)
	    {
	   
	    int b=a%10;
	      a=a/10;
	  	sum=b+sum;
	      
	    }
	    System.out.println("Sum of digits of entered Number is: " + sum);
	}

}
