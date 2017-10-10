package org.felight.springcore;

import javax.annotation.PostConstruct;
public class Restaruant{
String welcomeNote;

public void setWelcomeNote(String welcomeNote) {
	this.welcomeNote = welcomeNote;
}
	
	public void greetCustomer(){
		System.out.println(welcomeNote);
	}

}
