/**
 * 
 */
package com.base.animal;

/**
 * @author Pradheep
 *
 */
public abstract class Animal {
	
	public String walk(){
		System.out.println("I am walking");
		return "I am walking";
	}
	
	public abstract String makeSound();
}
