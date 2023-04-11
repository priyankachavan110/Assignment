package ifelsecondition;

import java.util.Scanner;

public class Question2 
{
	
/*write a code to find number of days in a month ?
You can use switch or if else any logic.
If input is 1 then output should be 31
because 1 is Januart and January having 31 days*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter month number: ");
	    int a = input.nextInt();
	    
	  if((a==1)||(a==3)||(a==5)||(a==7)||(a==8)||(a==10)||(a==12))
	  {
		    System.out.println("Entered month has 31 number of days");
		  
	  }
	  else if((a==4)||(a==6)||(a==9)||(a==11))
	  {
		    System.out.println("Entered month has 30 number of days");
	  }
	  
	  else if ((a==2))
	  {
		    System.out.println("Entered month has 28/29 number of days");
	  }
	  else
	  {
		    System.out.println("Invalid month");
	  }
	}

}
