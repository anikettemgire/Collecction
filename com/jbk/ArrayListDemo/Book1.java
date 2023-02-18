package com.jbk.ArrayListDemo;
import java.util.*;

public class Book1 {

	public static void main(String[] args) {
	    Map<Integer,Book> m=new HashMap<>();
	    m.put(1, new Book("c",401,"aet","2000",200));
	    m.put(2, new Book("java",102,"aket","3000",20));
	    m.put(3, new Book("php",444,"anik","2022",28));
	    m.put(4, new Book("html",455,"anike","2024",27));
	     for(Map.Entry<Integer,Book> ma:m.entrySet()) {
	    	 int key=ma.getKey();
	    	 Book b=ma.getValue();
	    	 System.out.println("detail "+key);
	    	 System.out.println(b.bookname +" "+ b.bid +" "+b.autorname+" "+b.publish+" "+b.quantiyt);
	    	 
	     }
	    
	    
	}

}
