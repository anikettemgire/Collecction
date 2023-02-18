package comrablecomaptro;

import java.util.Comparator;

import comparto.Student;



public class Empid implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getEmpid()-o2.getEmpid();

		  
	}




}
