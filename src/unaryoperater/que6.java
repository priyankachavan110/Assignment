package unaryoperater;

public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to convert seconds to hour, minute and seconds
		int i=86399;
		
		int a=i/3600;
		int b=i%3600;
		int c=b/60;
		int d=b%60;
				
		System.out.print(a +"hours ");
		System.out.print(c+"min ");	
		System.out.print(d+"sec");	
	}

}
