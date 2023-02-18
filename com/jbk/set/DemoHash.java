package com.jbk.set;

import java.util.HashSet;
import java.util.Set;

public class DemoHash {

	public static void main(String[] args) {
		 Set<String> s= new HashSet<>();
		 s.add("aniket");
		 s.add("karkit");
		 s.add("sma");
		 System.out.println(s.isEmpty());
		 s.remove("sma");
		 System.out.println(s);
		 Set<String> s1= new HashSet<>();
		 s1.add("ani");
		 s1.add("subodh");
		 s1.add("ajit");
		 s1.add("aniket");
		 s1.add("aniket");
		 System.out.println(s1);
//		 System.out.println(s1);
//		 s.addAll(s1);
//		 System.out.println(s);
//		 s.removeAll(s1);
//		 System.out.println(s);
		 System.out.println(s.contains("aniket"));
	//	 s1.add(1,"aniket");
		
		 

	}

}
