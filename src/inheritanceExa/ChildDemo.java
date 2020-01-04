package inheritanceExa;

public class ChildDemo extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo c=new ChildDemo();
				c.Break();
				c.Colour();
				c.engine();

	}
	
	//This is a method of this child class
	public void engine()
	{
		System.out.println("Engine is implemented");
	}
	
	

}
