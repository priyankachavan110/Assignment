package class_intro;

public class TestCase {

	int testId;
	String testName;
	String fun;
	String testdisc;
	boolean status;
	int priority;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestCase t1= new TestCase();
       t1.testId=101;
       t1.testName="login";
       t1.fun="sign in";
       t1.testdisc="check able to login in";
       t1.priority=2;
       t1.status=true;
       
       System.out.println("Testcase Id ="+ t1.testId);
       System.out.println("Status ="+ t1.status);

       
       TestCase t2= new TestCase();
       t2.testId=102;
       t2.testName="log Out";
       t2.fun="signing out";
       t2.testdisc="check able to log out";
       t2.priority=2;
       t2.status=false;
		
       System.out.println("Testcase Id ="+ t2.testId);
       System.out.println("Status ="+ t2.status);
	}

}
