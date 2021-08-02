/**
 * 
 */
package com.base.animal;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Pradheep
 *
 */
public abstract class Animal {
	
	private Locale locale;
	
	private ResourceBundle languageResource = ResourceBundle.getBundle("language", locale);
	
	public String walk(){
		System.out.println("I am walking");
		return "I am walking";
	}
	
	public abstract String makeSound();

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public ResourceBundle getLanguageResource() {
		return languageResource;
	}

	public void setLanguageResource(ResourceBundle languageResource) {
		this.languageResource = languageResource;
	}
}
