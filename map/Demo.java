package map;
import java.util.*;
import java.util.Map.Entry;
public class Demo {

	public static void main(String[] args) {
		 Map<Integer,String> m=new HashMap<>();
		 m.put(1, "Aniket");
		 m.put(2, "subodh");
		 m.put(3, "Ajit");
		 m.put(4, "sanket");
		 m.put(5, "ajink");
		  Map<Integer,String> sm=new LinkedHashMap<>();
		 Set<Entry<Integer,String>> s=m.entrySet();
		 for(Entry<Integer,String> i:s) {

               if(i.getKey()%2==0 && i.getValue().contains("s")) {
            	  m.remove(i);
            	   
            	   
               }else {
            	   sm.put(i.getKey(), i.getValue());
            	  // System.out.println(i.getValue()+" "+i.getKey());
               }
		 }
		 System.out.println("in linked hash map is the");
		 Set<Entry<Integer,String>> s1=sm.entrySet();
		 for(Entry<Integer,String> l:s1) {
			 System.out.println(l.getValue()+" "+l.getKey());
			 
		 }
		
	}

}
