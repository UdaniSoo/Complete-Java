package listCollection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		//adding values
		hs.add("Australia");
		hs.add("Singapore");
		hs.add("Sri Lanka");
		hs.add("Sri Lanka");
		System.out.println(hs);
		System.out.println(hs.remove("Singapore"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);

	}

}
