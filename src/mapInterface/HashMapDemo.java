package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//insert values to HashMap
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(42, "Morning");
		hm.put(3, "Evening");
		
		//Retrive values
		//System.out.println(hm.get(42));
		
		//Remove
		//hm.remove(42);
		//System.out.println(hm.get(42));
		
		//EntrySet: Each key an value will store as an Set index.
		//Converting above hashmap into a Set
		//After convert, store converted collection in sn
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext())  //this will return both key and value since this getting data from hashMap.
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		

	}

}
