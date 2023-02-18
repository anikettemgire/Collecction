package com.jbk.collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		Set s =new HashSet<>();
		s.add("aniket");
		s.add("subodh");
		s.add("aniket");
		s.add(11);
		System.out.println(s);
		System.out.println(s.size());
		Set s1 =new HashSet();
		s1.add("aniket");
		s1.add(15);
		System.out.println(s1);
		//s1.clear(); 
		//s1.remove("anket");
		//s.addAll(s1);
		s1.add(11);
		s1.add(null);
		s1.add(null);
		System.out.println(s);
		System.out.println(s1);
		s.removeAll(s1);
		System.out.println(s1);
		
		

	}

}
