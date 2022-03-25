package com.bridgelabz.addressbook;

public class AddressBook {
	String firstName, lastName , city, state, address;
	int zipCode;
	long phoneNo;
	
	public void contactDetails() {
		firstName = "Sayandh";
		lastName = "V";
		address = "KK house";
		city = "Kozhikode";
		state = "Kerala";
		zipCode = 654;
		phoneNo = 984512365;
	}
	
	public void printDetails() {
		System.out.print("First name: " +firstName + "\nLast name: " +lastName + "\nAddress: " +address + "\nCity" +city + "\nState" +state + "\nPhoenNo: " +phoneNo + "\nZip code: " + zipCode);;
	}
}		