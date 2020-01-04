package coreJavaTraiing;

public class ReverseDemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Udani";
		String t="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			t=t+s.charAt(i);	
			//System.out.println(t);
		}
		
		System.out.println(t);
		
		//if the string is "madam", the reverse also "madam"(This is called palindrome)
		if(s==t)
		{
			System.out.println("It is Palindrome");
		}
		
		else
		{
			System.out.println("No a palindrome");
		}
	}
	
	
}
