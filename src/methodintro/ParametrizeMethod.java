package methodintro;

public class ParametrizeMethod
{
   int square(int a)
   {
	   int squ=a*a;
	   return squ;
   }
   
   static int greaternum(int a,int b,int c)
   
   {
	  if (a>b && a>c)
	  {
		  return a;
	  }else if(b>a && b>c)
	  {
		  return b;
		  
      }
	  return c;
	  
	  
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greater num is " +ParametrizeMethod.greaternum(5, 78, 98));
		
		
		ParametrizeMethod p1= new ParametrizeMethod();
		System.out.println("Square of num is " +p1.square(98));

	}
	

}
