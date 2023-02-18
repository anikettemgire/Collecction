package map;
import java.util.*;
import java.util.Map.Entry;

public class Book1 {

	public static void main(String[] args) {
		 HashMap<Integer,Book> h=new HashMap<>();
		 h.put(1,new Book(101,"c","aniket","2002",100));
		 h.put(2,new Book(102,"java","anik","3002",200));
		 h.put(3,new Book(103,"html","an","4002",300));
		 
         Set<Entry<Integer,Book>> s=h.entrySet();
         for(Entry<Integer,Book> x:s) {
        	 int key=x.getKey();
        	 Book b=x.getValue();
        	 System.out.println("Details "+key);
        	 System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.autor+" "+b.quantiy);
        	 
         }
        
	}

}
