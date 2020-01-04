package coreJavaTraiing;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String a=" JavaTraining"; // This is String Literal
		 String ab=new String("Hello"); //This is creating an object
		 
		 //reading characters of a string
		 System.out.println(a.charAt(1));
		 
		 //finding the index of a charcter
		 System.out.println(a.indexOf("4"));
		 
		 //Print a section of given string
		 System.out.println(a.substring(1, 3));
		 
		 //This will pring all strings starting from given
		 System.out.println(a.substring(2));
		 
		 //Contactanate
		 System.out.println(a.concat("Udani learning"));
		 
		 //Remove spaces
		 System.out.println(a.trim());
		 
		 //Uppercase lowercase
		 System.out.println(a.toUpperCase());
		 System.out.println(a.toLowerCase());
		 
		 //split
		 String arr[]=a.split("T");
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 
		 //replace letters
		 System.out.println(a.replace("T", "S"));
	}

}
