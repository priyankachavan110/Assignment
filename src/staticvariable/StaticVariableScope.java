package staticvariable;

public class StaticVariableScope {

	class A{
		static int i=10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.print(A.i);
 
 // A a1= new A();
	}

}


//Static variable can access direct with classname.Static variable
// cannot access with new object creation
//so it will give error at A a1= new A();
//as no instance variable created at class A and static variable will not get access through object a1
