package com.best.data_structure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable balance=new Hashtable();
		Enumeration names;
		String str;
		double bal;
		balance.put("t",  new Double(3434.5));
		balance.put("s", new Double(79034.2));
		balance.put("a", new Double(70822.5));
		balance.put("q", new Double(95000.2));
		
		names = balance.keys();
		while(names.hasMoreElements()) {
			str =(String) names.nextElement();
			System.out.println(str+": "+balance.get(str));
			
		}
		System.out.println();
		bal=((Double)balance.get("t"));
		balance.put("t", new Double(bal + 1000));
	      System.out.println("t's new balance: " + balance.get("t"));
		
	}

}
