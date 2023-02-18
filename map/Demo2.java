package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Demo2 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		 m.put(1, "Aniket");
		 m.put(2, "subodh");
		 m.put(3, "Ajit");
		 m.put(4, "sanket");
		 m.put(5, "ajink");
		 m.putIfAbsent(4, "ajit");
		 //System.out.println(m.containsValue("Ajit"));
		 // m.compute(3, (key,val)->val.concat("singh"));
		 m.replaceAll((k,v)->"ajay");
		 Set<Entry<Integer,String>> s=m.entrySet();
		 

		 for(Entry<Integer,String> i:s) {
                 
          	   System.out.println(i.getValue()+" "+i.getKey());
             }
		 }
	}

