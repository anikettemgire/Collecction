package com.jbk.studnet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		MakeStudent m= new MakeStudent(); //magcha class cha object;
//		ArrayList<Student> stud=m.studnetList(); // call this method and the to store info in the list and refer varible
//		for(Student x:stud) {
//			System.out.println("the name is the  " + x.getName());
//			System.out.println("the mark is the  " + x.getMark());
//			System.out.println("the roll is the  " + x.getRollno());
//			System.out.println("--------------   ");
			ArrayList<String> ani =m.userList(); // call the method and store in list temport variable
//			for(String n: ani) {
//				System.out.println(n); // using the for each loop
      for(int i=0;i<ani.size();i++) {
    	  System.out.println(ani.get(i));   // using anothe for loop
      }

	}

}
