package forloop;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//program to print numbers between 1 to 100 which are divisible by 3, 5 and by both

	int i=0;
	System.out.println(" Divided by 3");
	for(i=1;i<=100;i++)
	{
		if(i%3==0)
		{
			System.out.print(i + " ");
			
		}
	}
	System.out.println( );
	System.out.println(" Divided by 5");
	for(i=1;i<=100;i++)
	{
		if(i%5==0)
		{
			System.out.print(i + " ");
			
		}
		
	}
	System.out.println( );
	System.out.println(" Divided by 3 and 5");
	for(i=1;i<=100;i++)
	{
		if(i%5==0 && i%3==0)
		{
			System.out.print(i + " ");
			
		}
	}
	
	}

}
