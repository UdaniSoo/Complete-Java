package polymorphismDemo;

public class PolymoDemo extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Overloading
		PolymoDemo p=new PolymoDemo();
		p.getdata(2);
		p.getdata("Udani");
		p.getdata(3, 5);
		p.sendData();

	}
	
	//overloading
	public void getdata(int a)
	{
		System.out.println(a);
	}
	
	public void getdata(String a)
	{
		System.out.println(a);
	}
	
	public void getdata(int a,int b)
	{
	System.out.println(a);
	System.out.println(b);
	}
	
	//Overriding
	public void sendData()
	{
		System.out.println("Data sending by child");
	}

}
