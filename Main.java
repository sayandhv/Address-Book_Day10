package com.bridgelabz.addressbook;

import java.security.PublicKey;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String firstName, lastName, emailId, city, state, address;
		int zipCode;
		long phoneNo;

		AddressBook contact = new AddressBook();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first name");
		firstName = scanner.nextLine();
		contact.setFirstName(firstName);
		
		System.out.println("Enter last name");
		lastName = scanner.nextLine();
		contact.setLastName(lastName);
		
		System.out.println("Enter email id");
		emailId = scanner.nextLine();
		contact.setEmailId(emailId);
		
		System.out.println("Enter city");
		city = scanner.nextLine();
		contact.setCity(city);
		
		System.out.println("Enter state");
		state = scanner.nextLine();
		contact.setState(state);
		
		System.out.println("Enter address");
		address = scanner.nextLine();
		contact.setAddress(address);
		
		System.out.println("Enter phoneNo");
		phoneNo = scanner.nextLong();
		contact.setPhoneNo(phoneNo);
		
		System.out.println("Enter zip code");
		zipCode = scanner.nextInt();
		contact.setZipCode(zipCode);
		
		EditContact editContact = new EditContact();
		editContact.displayContact(contact);
		
		System.out.println("\nDo you want to edit Y/N");
		char editOption = scanner.next().charAt(0);
		
		if(editOption == 'Y') {
			editContact.editContact(contact);
			editContact.displayContact(contact);
		}
		else {
			System.out.println("OK");
		}
		
		System.out.println("Do you want to delete contact Y/N");
		char deleteOption = scanner.next().charAt(0);
		if(deleteOption == 'Y') {
			editContact.deleteContact(contact);
			editContact.displayContact(contact);
		}
		else {
			System.out.println("OK");
		}
	}
}
