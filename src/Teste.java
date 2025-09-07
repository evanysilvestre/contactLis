import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Contact {
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
	
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    @Override
	public String toString() {
		return "Contact [name=" + name + ",  phone=" + phone + "]";
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
	
	static void createContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
        contacts.add(contact);
        System.out.println("Your contact was created! " + contacts);
	}
	
	static void findContact(String name) {
		for (Contact c: contacts) {
			if (name == c.getName()) {
			contacts.remove(c);
			System.out.println("Your contact was removed!");
			System.out.println(contacts);
		} else {
			System.out.println("There is no contact with this name! Try another name");
		}
			
			
		}
	}
	
    public static void main(String[] args) {
    	for (int i=0;i<2;i++) {
    		String askedName = askName();
        	String askedPhone = askPhone();
        	createContact(askedName, askedPhone);
    	}
    	
    	System.out.println(contacts);
    	System.out.println("Enter the name you wanna delete: ");
    	String name = scn.nextLine();
    	findContact(name);
    	
        scn.close();
    }
}