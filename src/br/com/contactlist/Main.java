package br.com.contactlist;

import br.com.contactlist.Controllers.ContactController;
import br.com.contactlist.View.ContactView;

public class Main {
	public static void main(String[] args) {
		ContactView view = new ContactView(); //An instance from ContactView Class;
		ContactController controller = new ContactController(view);
		controller.start();
	}
}
/*Here we have 2 instances and 1 method. view instance comes from ContactView class, controller instance and start Method comes from ContactController. */