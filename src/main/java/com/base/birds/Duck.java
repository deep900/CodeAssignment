/**
 * 
 */
package com.base.birds;

import com.base.animal.Animal;
import com.base.animal.ApplicationConstants;
import com.base.behaviour.Swimmer;

/**
 * @author Pradheep
 *
 */
public class Duck extends Animal implements Swimmer {

	
	public  String swim() {
		return ApplicationConstants.SWIMMING;
	}

	
	@Override
	public String makeSound() {
		return ApplicationConstants.QUACK_SOUND;
	}

}
