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
public class Parrot extends Animal {

	private String parrotType;

	public String getParrotType() {
		return parrotType;
	}

	public void setParrotType(String parrotType) {
		this.parrotType = parrotType;
	}

	@Override
	public String makeSound() {
		switch (getParrotType()) {
		case ApplicationConstants.PARROT_LIVING_WITH_DOG:
			return ApplicationConstants.PARROT_LIVING_WITH_DOG;
		case ApplicationConstants.PARROT_LIVING_WITH_CAT:
			return ApplicationConstants.PARROT_LIVING_WITH_CAT;
		case ApplicationConstants.PARROT_LIVING_WITH_ROOSTER:
			return ApplicationConstants.PARROT_LIVING_WITH_ROOSTER;
		default:
			return "Unknown parrot";
		}
	}

}
