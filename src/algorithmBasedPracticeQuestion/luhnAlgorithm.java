package algorithmBasedPracticeQuestion;

import java.util.Scanner;

public class luhnAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Luhn Algorithm is simple checksum formula used to validate different identification numbers like credit card numbers, IMEI Numbers, National Provider Identifier Numbers etc.
 * Algorithm Structure
From the rightmost side, (the last digit is known as check digit). Double every second number. And then sum the digits of the products
take the sum of all digit.
if the total module 10 is 0 then the number is valid else number is invalid.
 */
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter brought amount : ");
	    int a = input.nextInt();
	    int sum=0;
	    
	    while(a%10>0)
	    {
	   
	    int b=a%10;
	     a=a/10;
	    sum=b+sum;
	    
	    }
	    
	    
	    
	}

}
