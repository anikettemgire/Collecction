package com.jbk.ArrayListDemo;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		 List<String> l=new ArrayList<>();
		 l.add("aniket");
		 l.add("sam");
		 l.add("subodh");
		 l.add("ajit");
		 System.out.println(l);
		List<String> l2=new ArrayList<>();
		 l2.add("aniket");
		 l2.add("sam");
		 l2.add("subodh");
		 l2.add("aji");
		List<String> l3=new ArrayList<>();
		for(String e:l) {
			l3.add(l2.contains(e) ? "true" :"false");
			
		}
		System.out.println(l3);
	}

}
