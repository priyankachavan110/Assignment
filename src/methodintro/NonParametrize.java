package methodintro;

public class NonParametrize {

	static int age;
	String Name;
	
     int birthday()
	{
		age++;
		return age;
	}
	 
     static String agegroup() 
     {
    	if (age>18)
    	{
    		return "Adult";
    	}
    	return "child";
     }
     
     
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 age=17;
		NonParametrize n1=new NonParametrize();
	       System.out.println("age is "+n1.birthday());

       System.out.println("age group is "+NonParametrize.agegroup());
	}

}
