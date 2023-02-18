package map;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		 Map<Integer,String> h1=new Hashtable<>();
		 h1.put(null, "Aniket");
		 h1.put(102, "sam");
		 for(Map.Entry ma:h1.entrySet()) {
			 System.out.println(ma.getKey() +" "+ma.getValue());
		 }
		 

	}

}
