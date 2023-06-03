package algorithmBasedPracticeQuestion;

import java.util.Scanner;

public class moneyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*You have to write one program where you will take input from user for Bought amount (56 in example) and money given (100 in example) by person

provide output return money changes.*/
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter brought amount : ");
	    int a = input.nextInt();
	     
	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Money given: ");
	    int b = input2.nextInt();
	    
	    
	    int bal= b-a;
	     
	    int ten=bal/10;
	    int coin=bal%10;
	    int two=coin/2;
	    int one=coin%2;
	    int ent=ten+two+one;
	    
	    System.out.println("give number of 10 rup note/coin: "+ ten);
	    System.out.println("give number of 2 rup coin: "+ two);
	    System.out.println("give number of 1 rup coin: "+ one);
	    System.out.println("given total number of entities are: "+ ent);
	}

}
