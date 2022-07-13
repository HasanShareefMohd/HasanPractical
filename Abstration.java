package com.java;

public class Abstration {
	Abstration () {
			System.out.println("Abstract class is created");
		}
		
		void run() {
		}
		
		void changeSpeed() {
			System.out.println("Speed changed");
		}
	}

	class Child extends Abstration {
		void run() {
			System.out.println("Running safely");
		}
		
	}

	class Abstraction1 {
		public static void main(String[] args) {
			Abstration obj = new Child();
			obj.run();
			obj.changeSpeed();
		}
	}


