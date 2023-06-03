package loopconcept;

public class febonanciSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		int a=0;
		int b=1;
		System.out.print("fibonacci sequence-"+ a + "," +b);
		for(int i=2;i<=15;i++)
		{
		int c=a+b;
		System.out.print(","+ c);
		 a=b;
		 b=c;
		}
	}

}
