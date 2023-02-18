package stack;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		  Stack<Integer> s1=new Stack<>();
		  s1.push(10);
		  s1.push(11);
		  s1.push(12);
		  s1.push(13);
		  int l=s1.search(13);
		  System.out.println(s1.size());
		  System.out.println(l);
		  System.out.println(s1);
		  
		  

	}

}
