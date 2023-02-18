package com.jbk.studnet;

import java.util.ArrayList;

public class MakeStudent {
	
    ArrayList<Student> studnetList() {
    	ArrayList<Student> s = new ArrayList<>();
   	 s.add(new Student("aniket", 99, 1));
   	 s.add(new Student("ajit", 111, 10));
   	 return s;
   	 
    }
     ArrayList<String> userList() {
    	 ArrayList<String> a= new ArrayList<>();
    	 a.add("aniket");
    	 a.add("kartik");
    	 a.add("ajinkya");
    	 return a; // eithe jo etun type ast toch method la asto
     }

}
