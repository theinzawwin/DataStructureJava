package com.best.data_structure;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		Enumeration days;
		Vector dayNames= new Vector();
		dayNames.add("Sunday");
		 dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();
	      while(days.hasMoreElements()) {
	    	  System.out.println("Day Name is=>"+days.nextElement());;
	      }
	}

}
