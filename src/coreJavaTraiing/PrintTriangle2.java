package coreJavaTraiing;

public class PrintTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		for(int i=1; i<=4; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println("");
		}
		
		int k=1;
		for(int i=1; i<=4; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}
	}

}
