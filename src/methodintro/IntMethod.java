package methodintro;

public class IntMethod {

	
	int addition(int a,int b)
	{
		int sum= a+b;
		return sum;
	}
	
	static int multipication(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntMethod i1=new IntMethod();
		System.out.println("addition is " +i1.addition(47,85));
		System.out.println("Multiplication is " +IntMethod.multipication(47,85));

	}

}
