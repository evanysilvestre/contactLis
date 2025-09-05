package br.com.contactlist;

import java.util.ArrayList;
import java.util.List;


public class ContactController {
	private List<Contact> contacts = new ArrayList<>();
	private ContactView view;
	
	//Contructor
	public ContactController(ContactView view) {
		this.view = view;
	}

	public void start() {
		int option;
		do {
			option = view.showMenu();
			switch (option) {
				case 1 -> createContact();
				case 2 -> view.showContacts(contacts);
				case 0 -> view.showMessage("Exiting...");
				default -> view.showMessage("Invalid option. Try again!");
			}
		} while (option != 0);
	}
	
	private void createContact() {
		String name = view.askName();
		String telefone = view.askTelefone();
		Contact contact = new Contact(name, telefone);
		contacts.add(contact);
		view.showMessage("Contact created successfully!");
	}
}
