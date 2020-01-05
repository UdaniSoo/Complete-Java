package listCollection;

import java.util.ArrayList;

public class ArrrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define an arraylist
		ArrayList<String> a=new ArrayList<String>();
		
		//Add values to arrayList
		a.add("Udani");
		a.add("Java");
		System.out.println(a);
		
		//adding to specific index
		a.add(0, "Thisara");
		System.out.println(a);
		
		/*Removing by index
		a.remove(1);
		
		//Removing by value
		a.remove("Java");
		System.out.println(a);
		*/
		
		//get values by index
		System.out.println(a.get(2));
		
		//Check whether "testing is present in the arraylist
		System.out.println(a.contains("testing"));
		
		System.out.println(a.contains("Java"));
		
		//Check the index of "Udani" in arraylist
		System.out.println(a.indexOf("Udani"));
		
		//Check the arraylist is empty
		System.out.println(a.isEmpty());
		
		//Check the size of arraylist
		System.out.println(a.size());
		
		//duplicate
		a.add("Java");
		System.out.println(a);
		
	}

}
