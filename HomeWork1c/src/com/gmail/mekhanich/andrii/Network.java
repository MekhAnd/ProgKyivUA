package com.gmail.mekhanich.andrii;

public class Network {
	private String name;
	private static Phone[] numbers = new Phone[10];

	public Network(String name) {
		super();
		this.name = name;
	}

	public Network() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Network [name=" + name + "]";
	}

	public String setRegistration(Phone number) {
		String registration = "";
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == null) {
				numbers[i] = number;
				registration = "Your registration " + number + " in the mobile network was successfully done!";
				break;
			}
		}
		registration = "Unfortunately, all possible connections were busy. Your number was not registered on the network.";
		return registration;
	}
	
	public static boolean getRegistration (Phone number) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null && numbers[i].getNumber() == number.getNumber()) {
				return true;
			}
		}
		
		return false;
	}

	
}

	


