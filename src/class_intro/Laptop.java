package class_intro;

public class Laptop {

	String companyName;
	String processer;
	double screenSize;
	String hardDisk;
	String colour;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Laptop l1=new Laptop();
       l1.colour="Gray";
       l1.companyName="lenovo";
       l1.hardDisk="1 TB";
       
       System.out.println(l1.companyName);
       System.out.println(l1.hardDisk);
       System.out.println(l1.colour);
  
             
       Laptop l2=new Laptop();
       l2.colour="silver";
       l2.screenSize=15.3;
       l2.companyName="HP";
       
       System.out.println(l2.companyName);
       System.out.println(l2.screenSize);
       System.out.println(l2.colour);

       
    		   
      
	}

}

