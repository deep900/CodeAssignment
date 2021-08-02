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
public class Fish extends Animal implements Swimmer{
	
	private String size;
	
	private String color;
	
	private boolean canEatOtherFish = false;
	
	private boolean canMakeJokes = false;

	@Override
	public String swim() {		
		return ApplicationConstants.SWIMMING;
	}

	@Override
	public String makeSound() {		
		return ApplicationConstants.MAKE_SOUND;
	}
	
	@Override
	public String walk(){
		return ApplicationConstants.IDONTWALK;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanEatOtherFish() {
		return canEatOtherFish;
	}

	public void setCanEatOtherFish(boolean canEatOtherFish) {
		this.canEatOtherFish = canEatOtherFish;
	}

	public boolean isCanMakeJokes() {
		return canMakeJokes;
	}

	public void setCanMakeJokes(boolean canMakeJokes) {
		this.canMakeJokes = canMakeJokes;
	}
	
}
