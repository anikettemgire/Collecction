package com.jbk.collectiondemo;


import java.util.ArrayList;
import java.util.List;

public class Listdemo {

	public static  void main(String[] args) {
		List l =new ArrayList();
		l.add("aniket");
		l.add(11);
		l.add(102);
		l.add("subodh");
		l.add(11);
		System.out.println(l);
		//l.remove("aniket");  // remove one
		System.out.println(l);
		//l.clear();//  all the clear
		//l.removeAll(l);
		l.addAll(l);
		System.out.println(l);
		System.out.println(l.isEmpty());
		List l2= new ArrayList();
		l2.add("ajit");
		l2.add("ajit");
		l2.add("aniket");
		l.addAll(l2);
	
		System.out.println(l);
		l.removeAll(l2);
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(2, "ani");
		System.out.println(l);
		System.out.println(l.indexOf(11));
		System.out.println(l.lastIndexOf(11));
		l.add(null);
		l.add(null);
		System.out.println(l);
	      

	}

}
