package com.base.birds;

import com.base.animal.Animal;
import com.base.animal.ApplicationConstants;
import com.base.behaviour.Flyable;
import com.base.behaviour.Singer;

public class Bird extends Animal implements Flyable, Singer{

	@Override
	public String sing() {		
		return ApplicationConstants.SINGING;
	}

	@Override
	public String fly() {
		return ApplicationConstants.FLYING;
	}

	@Override
	public String makeSound() {
		return ApplicationConstants.MAKE_SOUND;
	}

}
