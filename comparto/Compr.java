package comparto;

import java.util.ArrayList;
import java.util.Collections;

import comrablecomaptro.Empid;
import comrablecomaptro.Empname;



public class Compr {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(14,"Zniket",101));
		al.add(new Student(12,"sam",145));
		al.add(new Student(13,"ajink",10));
		Collections.sort(al,new Empid());
		System.out.println(al);

		ArrayList<Student> a=new ArrayList<>(al);
		Collections.sort(a,new Empname());
		System.out.println(a);
	}

}
