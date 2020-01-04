package arrayDemo;

public class Multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 2 4 5
	 * 3 4 7
	 */
	int a[][]=new int[2][3];
	a[0] [0]=2;
	a[0] [1]=4;
	a[0] [2]=5;
	
	a[1] [0]=3;
	a[1] [1]=4;
	a[1] [2]=7;
    //a[raw] [column]
	
	System.out.println(a[1][0]);
	
	//Print a[][]
	for(int i=0; i<2; i++) //raw
		
	{
		for(int j=0; j<3; j++)  //column
		{
			System.out.print(a[i][j]);
		}
		System.out.println("");
	}
	
	
	//simple way of defining multidimension array
	 int b[][]= {{2,4,5},{3,4,7}};
	 System.out.println(b[1][1]);
	
	}
	

}
