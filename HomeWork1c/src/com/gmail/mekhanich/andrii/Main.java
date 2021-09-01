package com.gmail.mekhanich.andrii;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone one = new Phone(100001, "John Smith");
		Phone two = new Phone(100002, "John Green");
		Phone three = new Phone(100003, "John Gray");
		Phone four = new Phone(100004, "Green Gray");
		Phone five = new Phone(100005, "Green Gray");
<<<<<<< HEAD
		Phone six = new Phone(100006, "One, One");
		Phone myPhone= new Phone(100008, "One, One");
=======
		Phone six = new Phone(100006, "One One");
>>>>>>> 8b49bbf41a6e1140ad2517e3649160fd7dfceef9
		
		Network firstMobyle = new Network("FM");
		
		firstMobyle.setRegistration(one);
		firstMobyle.setRegistration(five);
		firstMobyle.setRegistration(myPhone);
		
		
		myPhone.outgoingCall(five);
	}

}
