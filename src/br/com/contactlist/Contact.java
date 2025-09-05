package br.com.contactlist;

//Model
public class Contact {
	private String name;
	private String phoneNumber;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//Constructor
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ",  phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	

}
