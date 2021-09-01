package com.gmail.mekhanich.andrii;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone one = new Phone(100001, "John Smith");
		Phone two = new Phone(100002, "John Green");
		Phone three = new Phone(100003, "John Gray");
		Phone four = new Phone(100004, "Green Gray");
		Phone five = new Phone(100005, "Green Gray");
		Phone six = new Phone(100006, "One, Two");
		Phone myPhone= new Phone(100008, "One, One");
		
		
		Network firstMobyle = new Network("FM");
		
		firstMobyle.setRegistration(one);
		firstMobyle.setRegistration(five);
		firstMobyle.setRegistration(myPhone);
		
		
		myPhone.outgoingCall(five);
	}

}
