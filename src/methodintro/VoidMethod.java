package methodintro;

public class VoidMethod 
{
	
	void printname(String k)  //NOn static method
	{
		System.out.println(k);
	}

	static void birthday(int age) // static method
	{
		age++;
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      VoidMethod v1= new VoidMethod(); 
      v1.printname("Priya"); 
      VoidMethod.birthday(32);
      
	}

}
