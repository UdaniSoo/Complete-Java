package arrayDemo;

public class MaxNumOfMinNumCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Print the min number from below metrix
		 * 2 4 5
		 * 3 4 7
		 * 1 2 9
		 */
		//min
		
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min=abc[0][0];
		
		//max of min
		int mincol = 0;
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					//get the column of min number
					mincol=j;
					
				}
				
			}
		}
		
		int max=abc[0][mincol];
		int k=0;
		while(k<3)
		{
			
		
		if(abc[k][mincol]>max)
		{
			max=abc[k][mincol];
			
		}
		k++;
		}
		System.out.println("Max number of metrix is: "+max);
		
		System.out.println("Min Number of max column is: "+min);
		

	}

}
