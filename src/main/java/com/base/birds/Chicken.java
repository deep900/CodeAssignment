/**
 * 
 */
package com.base.birds;

import com.base.animal.Animal;
import com.base.animal.ApplicationConstants;

/**
 * @author Pradheep
 *
 */
public class Chicken extends Animal {

	
	@Override
	public String makeSound() {		
		return ApplicationConstants.CLUCK_SOUND;
	}

}
