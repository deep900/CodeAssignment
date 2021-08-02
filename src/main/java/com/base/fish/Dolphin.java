/**
 * 
 */
package com.base.fish;

import com.base.animal.Animal;
import com.base.animal.ApplicationConstants;
import com.base.behaviour.Swimmer;

/**
 * @author Pradheep
 *
 */
public class Dolphin extends Animal implements Swimmer {

	
	@Override
	public String swim() {		
		return ApplicationConstants.SWIMMING;
	}

	
	@Override
	public String makeSound() {		
		return ApplicationConstants.MAKE_SOUND;
	}

}
