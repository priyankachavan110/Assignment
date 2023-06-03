package class_intro;

public class Human {
    int age;
    int height;
    double weight;
    String name;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Human a1= new Human();
       
      a1.age=30;
      a1.name="priya";
      
       Human a2= new Human();
       a2.height=166;
       a2.age=32;
       a2.name="amar";
       
       System.out.println("my name is "+a1.name);
       System.out.println("my age is "+a1.age);
       
       System.out.println("my name is "+a2.name);
       System.out.println("my age is "+a2.age);


	}}


