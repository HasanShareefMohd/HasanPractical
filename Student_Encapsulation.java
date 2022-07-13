package com.java;

public class Student_Encapsulation {
	
		private String name;
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

	}

	class Test_Encapsulation {
		public static void main(String[] args) {
			Student_Encapsulation obj = new Student_Encapsulation();
			obj.setName("Sayan"); 
			System.out.println(obj.getName()); 
		}
	}


