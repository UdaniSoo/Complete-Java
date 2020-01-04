package coreJavaTraiing;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Print
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		
		int k=1;
		
		for(int i=0; i<4; i++)
		{
			for(int j=1; j<=4-i; j++)
			{
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

}
