/**
 * 
 */
package com.base.fly;

import com.base.animal.Animal;
import com.base.animal.ApplicationConstants;
import com.base.behaviour.Flyable;

/**
 * @author Pradheep
 *
 */
public class Butterfly extends Animal implements Flyable {

	private boolean isCaterpillar = false;
	
	public Butterfly(boolean isCaterpillar) {
		setCaterpillar(isCaterpillar);
	}
	
	@Override
	public String fly() {	
		if(isCaterpillar()){
			return ApplicationConstants.DONTFLY;
		}
		return ApplicationConstants.FLYING;
	}

	
	@Override
	public String makeSound() {
		return ApplicationConstants.IDONTMAKESOUND;
	}

	@Override
	public String walk(){
		if(isCaterpillar()){
			return ApplicationConstants.CRAWL;
		}
		return ApplicationConstants.IDONTWALK;
	}


	public boolean isCaterpillar() {
		return isCaterpillar;
	}


	public void setCaterpillar(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}
}
