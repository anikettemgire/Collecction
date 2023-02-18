package com.jbk.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		a.add(122);
		a.add(1);
		a.add(0);
		a.add(18);
		a.add(15);
		//a.remove(1);
		//a.add("pavan");
		//a.remove("pavan");
		//a.removeAll(a);
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(22);
		a1.add(1);
		a1.add(0);
		a1.add(18);
		a1.add(15);
		System.out.println(a);
		System.out.println(a1);
		
		a.removeAll(a1);
		System.out.println(a);
		System.out.println(a1);

	}

}
