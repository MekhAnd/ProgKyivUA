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
	
	public boolean outgoingCall (Phone numberAccept) {
		boolean permit = false;
		if (Network.getRegistration(this) == true) {
			if (Network.getRegistration(numberAccept)) {
				permit = true;
				incomingCall(permit, numberAccept, this);
				return permit;
				} else {
				System.out.println("The number " + numberAccept + " was not registrated on network");
			}
		} else {
		System.out.println("Your number was not registered on the network.");
		}
		return permit;
	}
	
	public void incomingCall (boolean permit, Phone numberAccept, Phone numberCall) {
		if (permit == true) {
		System.out.println("The abonent number " + numberAccept + " has new incoming call from abonent number " + numberCall);
		} else {
		System.out.println("Please be informed that all call in network is possible only after registration on phones in this network");
		}
		
	}

}
