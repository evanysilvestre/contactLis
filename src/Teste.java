import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Contact {
	public int id;
    private String name;
    private String phone;
   
    public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
    public Contact(String name, String phone, int id) {
    	this.id = id;
        this.name = name;
        this.phone = phone;
    }
    
    @Override
	public String toString() {
		return "Contact [id="+ id + ", name=" + name + ",  phone=" + phone + "]";
	}
}

public class Teste {
	static Scanner scn = new Scanner(System.in);
	static List<Contact> contacts = new ArrayList<>();
	
	static String askName() {
		System.out.println("Please, enter your name: ");
		String name = scn.nextLine();
        return name;
	}
	
	static String askPhone() {
		System.out.println("Please, enter your Phone: ");
		String phone = scn.nextLine();
        return phone;
	}
	
	static void createContact(String name, String phone, int id) {
		Contact contact = new Contact(name, phone, id);
        contacts.add(contact);
        System.out.println("Your contact was created! " + contacts);
	}
	
	static void findContactByName(String name) {
		boolean found = false;
		for (Contact c: contacts) {
			if (name.equalsIgnoreCase(c.getName())) {
				System.out.println(c);
				found = true;
				break;
			}
		}
		
		if (!found) {
	        System.out.println("There is no contact with this name! Try another name");
	    }
	}
	
	static void deleteContact(String name) {
		for (Contact c: contacts) {
			if (name.equalsIgnoreCase(c.getName())) {
				contacts.remove(c);
				System.out.println(c.getName() + " was removed succesfully!");
				break;
			} else {
				System.out.println("There is no contact with this name! Try another name");
			}
		}
	}
	
    public static void main(String[] args) {
    	for (int i=0;i<5;i++) {
    		String askedName = askName();
        	String askedPhone = askPhone();
        	int id = i+1;
        	createContact(askedName, askedPhone, id);
    	}
    	
    	System.out.println("Enter the name you wanna delete: ");
    	String name = scn.nextLine();
    	deleteContact(name);
    	
    	System.out.println(contacts);
    	
    	/*System.out.println("Enter the name you wanna find: ");
    	String name = scn.nextLine();
    	findContactByName(name);*/
    	
        scn.close();
    }
}