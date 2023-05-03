package forloop;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=5;i>=0;i--)
		{
			for (int k=5-i;k>0;k--)
			{
		    System.out.print(" ");
			}
			for (int j=i;j>0;j--)
			{
			System.out.print("*");
			//j--;
		    }
			System.out.println();
		}


	}

}
