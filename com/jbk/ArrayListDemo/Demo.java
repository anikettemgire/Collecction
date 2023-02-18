package com.jbk.ArrayListDemo;
import java.util.*;


public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		 al.add(75);
		 al.add(48);  
		 al.add(89);
		 al.add(47);
		 al.add(54);
		 al.add(21);
		
		 System.out.println("Revrse All The Array List");
		for(int i=0;i<al.size();i++) {
			int rev=0;
			int no=al.get(i);
			while(no>0) {
				int r=no%10;
				 rev=rev*10+r;
				 no=no/10;
				}
			  
			 System.out.println(rev);
         }
		
		
	}
}
