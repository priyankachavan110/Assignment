package returnkeyword;

public class ReturnKeyword {
	
	
	class A{



		public static int test1()
		{

	     System.out.println("Hello this is test1 method");
		  return 10;
		}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A.test1();
         int a= A.test1();
	  	  System.out.println(a);

	}

}


// can not write statement post return statement
// void method does not req return statement
