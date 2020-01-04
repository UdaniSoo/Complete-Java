package coreJavaTraiing;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//outer loop, this will loop 4 times
		for(int i=1; i<=4; i++)
		{
			System.out.println("Outer loop started");
			//inner loop
			for(int j=1; j<=4; j++)
			{
				System.out.println("Inner loop");
			}
			System.out.println("Inner loop ended");
		}
		
		System.out.println("Outer loop ended");

	}

}
