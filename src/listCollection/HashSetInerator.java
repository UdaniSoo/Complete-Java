package listCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Australia");
		hs.add("Singapore");
		hs.add("Sri Lanka");
		hs.add("She");
		hs.add("He");
		
		Iterator<String> i=hs.iterator(); //traverse though all elements of hs.
		while(i.hasNext()) //hasNext method is checking whether next element is present before it moving to next.
		{
		System.out.println(i.next());
		}


	}

}
