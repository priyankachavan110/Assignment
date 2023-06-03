package class_intro;

public class  SoprtsMan
{

	String name;
	int age;
	int heighit;
	int weight;
	String soprtPlay;
	String Country;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SoprtsMan s1= new SoprtsMan();
          s1.name= "dhoni";
          s1.soprtPlay="cricket";
          
          System.out.println(s1.name);
          System.out.println(s1.soprtPlay);
          
          SoprtsMan s2= new SoprtsMan();
          s2.name= "messi";
          s2.soprtPlay="foodball";
		
          System.out.println(s2.name);
          System.out.println(s2.soprtPlay);
	}

}
