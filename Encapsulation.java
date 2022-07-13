package com.java;

public class Encapsulation {
	
		private long accNo;
		private String name, email;
		private float amount;
		public long getAccNo() {
			return accNo;
		}
		public void setAccNo(long accNo) {
			this.accNo = accNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}

	}

	class TestEncapsulation{
		public static void main(String[] args) {
			Encapsulation obj= new Encapsulation();
			obj.setAccNo(317831);
			System.out.println(obj.getAccNo());
			obj.setName("Sayan");
			System.out.println(obj.getName());
			obj.setEmail("sayanrick100@gmail.com");
			System.out.println(obj.getEmail());
			obj.setAmount(200000);
			System.out.println(obj.getAmount());
		}
	}


