package map;
import java.util.*;
public class Test {

	
	public static void main(String[] args) {
	   HashMap<Integer,String> h1=new HashMap<>();
	   h1.put(100, "aniket");
	   h1.put(101,"sam");
	   h1.put(10 ,"aa");
	   for(Map.Entry m:h1.entrySet()) {
		   System.out.println(m.getKey()+" "+m.getValue());
	   }

	}

}
