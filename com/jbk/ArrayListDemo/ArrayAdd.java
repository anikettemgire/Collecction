package com.jbk.ArrayListDemo;

import java.util.ArrayList;

public class ArrayAdd {

	public static void main(String[] args) {
		   ArrayList<Integer> first = new ArrayList<>();
		   first.add(1);
		   first.add(2);
		   first.add(3);
		   first.add(4);
		   first.add(5);
		  
		   ArrayList<Integer> all = new ArrayList<>(first);
		   ArrayList<Integer> nextFive = new ArrayList<>();
		   nextFive.add(6);
		   nextFive.add(7);
		   nextFive.add(8);
		   nextFive.add(9);
		   nextFive.add(10);
		   
		  
		   System.out.println(first);
		   System.out.println(nextFive);
		   all.addAll(nextFive);
		   System.out.println(all);
		   

	}

}
