package com.best.data_structure;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableExercise {

	public static Hashtable students=new Hashtable();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key=1;
		do {
			Scanner sc=new Scanner(System.in);
			key=Integer.parseInt(sc.nextLine());
			if(key==1) {
				addStudent();
			}else if(key==2) {
				searchByRollNo();
			}else if(key==3) {
				deleteStudent();
			}else if(key==4) {
				showAll();
			}else if(key==0) {
				break;
			}
			System.out.println("Do you want to continue,Press 0");
		}while(key!=0);
		
	}
	static void addStudent() {
		Scanner sc=new Scanner(System.in);
		int result=1;
		do {
			System.out.println("Please Type rollno");
			int rollNo=Integer.parseInt(sc.nextLine());
			System.out.println("Please Type Name:");
			String name=sc.nextLine();
			System.out.println("Please Type Nrc:");
			String nrc=sc.nextLine();
			Student std=new Student(rollNo, name, nrc);
			students.put(rollNo, std);
			System.out.println("Continue=1; Exit =0");
			result=Integer.parseInt(sc.nextLine());
		}while(result==1);
		
		sc.close();
	}
	static void showAll() {
		Enumeration stdList= students.elements();
		while(stdList.hasMoreElements()) {
			Student std=(Student)stdList.nextElement();
			System.out.println(std.toString());
		}
	}
	static void searchByRollNo() {
		int rollno=1;
		int key=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Type Roll No");
		do {
			rollno= Integer.parseInt(sc.nextLine());
			if(students.containsKey(rollno)) {
				Student std=(Student)students.get(rollno);
				System.out.println(std.toString());
				System.out.println("Do you want to continue? Press=1; Exit=0");
			}else {
				System.out.println("Not Found");
				
			}
		}while(key==1);
		
		
		
	}
	static void deleteStudent() {
		int rollno=1;
		int key=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Type Roll No");
		do {
			rollno= Integer.parseInt(sc.nextLine());
			if(students.containsKey(rollno)) {
				students.remove(rollno);
				
				System.out.println("Do you want to continue? Press=1; Exit=0");
			}else {
				System.out.println("Not Found");
				
			}
		}while(key==1);
		
		
	}
	static void showNameSimilar() {
		String name="";
		Enumeration std=students.elements();
		while(std.hasMoreElements()) {
			Student st=(Student)std.nextElement();
			
		}
	}

}
