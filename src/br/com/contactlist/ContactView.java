package br.com.contactlist;

import java.util.List;
import java.util.Scanner;

public class ContactView {
	private Scanner scanner = new Scanner(System.in);
	
	public int showMenu() {
		System.out.println("\n--- Contact List Menu ---");
        System.out.println("1. Create a new contact");
        System.out.println("2. Show all contacts");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
	}
	
	public String askName() {
		scanner.nextLine(); // consume leftover newline
        System.out.print("Enter contact name: ");
        return scanner.nextLine();
	}
	
	public String askTelefone() {
		System.out.print("Enter contact telefone: ");
        return scanner.nextLine();
	}
	
	public void showContacts(List<Contact> contacts) {
		if(contacts.isEmpty()) {
			System.out.println("No contacts found.");
		} else {
			System.out.println("\n--- Contact List ---");
			for (Contact c: contacts) {
				System.out.println(c);
			}
		}
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}
