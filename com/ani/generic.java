package com.ani;
import java.util.*;
class m{
	 
	  public   static <T> void printArray(T name[]){
		  for(int i=0;i<5;i++) {
		  System.out.println(name[i]);
		  }
	  }
}

public class generic {

	public static void main(String[] args) {
		 Integer a[]= {10,20,30,40,50};
		 System.out.println("----Interger Array---");
		 m.printArray(a);
		 String name[]= {"Aniket","sam","ait","anikta","an"};
		 System.out.println("----String Array---");
		  m.printArray(name);
		 Double Array[]= {1.2,2.4,3.4,5.2,3.6};
		 System.out.println("----Double Array---");
		 m.printArray(Array);
		 Character [] chararray= {'h','t','s','j','a'};
		 System.out.println("----Charater Array---");
		 m.printArray(chararray);
		 }
	
	
}	 


