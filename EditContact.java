package com.bridgelabz.addressbook;

import java.util.Scanner;

public class EditContact {
	
	public void editContact(AddressBook contact) {
		String newAddress;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter the name of the contact to be edited: ");
		String editName = scanner.nextLine();
		if(editName.equals(contact.firstName)) {
			System.out.println("Enter new address");
			newAddress = scanner.nextLine();
			contact.setAddress(newAddress);
		}
		else {
			System.out.println("Couldnt find contact");
		}
	}
	
	public void displayContact(AddressBook contact) {
		System.out.print("First name: " +contact.getFirstName());
		System.out.println("\nLast Name: " +contact.getLastName());
		System.out.print("\nAddress     : " +  contact.getAddress());
        System.out.print("\nCity        : " +  contact.getCity());
        System.out.print("\nState       : " +  contact.getState());
        System.out.print("\nPone Number : " +  contact.getPhoneNo());
        System.out.print("\nE-mail      : " +  contact.getEmailId());
        System.out.print("\nZip         : " +  contact.getZipCode());
		}
}
