package br.com.contactlist;

public class Main {
	public static void main(String[] args) {
		ContactView view = new ContactView(); //An instance from ContactView Class;
		ContactController controller = new ContactController(view);
		controller.start();
	}
}
