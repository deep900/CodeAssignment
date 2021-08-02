/**
 * 
 */
package com.base.birds;

import com.base.animal.ApplicationConstants;

/**
 * @author Pradheep
 *
 */
public class Rooster extends Chicken {
	
	@Override
	public String makeSound(){
		return ApplicationConstants.COCK_A_DOODLE;
	}

}
