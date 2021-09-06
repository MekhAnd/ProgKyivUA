package com.gmail.mekhanich.andrii;

public class Phone {
	private int number;
	private String customerName;

	public Phone(int number, String customerName) {
		super();
		this.number = number;
		this.customerName = customerName;
	}

	public Phone() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", customerName=" + customerName + "]";
	}
	
	public void outgoingCall (int a) {
		if (Network.getRegistration(this.number) == true) {
			if (Network.getRegistration(a) == true) {
				System.out.println("Call subscriber " + a);
				} else {
					System.out.println("The number " + a + " was not registrated on network");
				}
		} else {
			System.out.println("Your number was not registered on the network.");
		}
	}
	
	public void incomingCall (int a) {
		if (Network.getRegistration(this.number) == true) {
			System.out.println("You have incoming call from " + a);
			} else {
				System.out.println("Your number was not registered on the network.");
		}
	}
	
}
