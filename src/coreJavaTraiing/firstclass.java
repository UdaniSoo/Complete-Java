package coreJavaTraiing;

public class firstclass {

	int a= 5;
	public void getData()
	{
		System.out.println("I am in a method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=55 ;
		System.out.println(a);
		System.out.println("Im in a main method");
		
		//Creating a object and call getData() method
		
		firstclass fc =new firstclass();
		
		//Calling method..
		fc.getData();
		
		//Calling variables.. 
		System.out.println("calling Variable from outside the main: " +fc.a);
		
		//Calling data from another java class(secondclass.java)
		secondclass sn=new secondclass();
		sn.setdata();
	}

}
