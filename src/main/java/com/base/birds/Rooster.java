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
		String otherLangContent = getLanguageResource().getObject(ApplicationConstants.COCK_A_DOODLE).toString();
		System.out.println("Bonus : printing other language content" + otherLangContent);
		return ApplicationConstants.COCK_A_DOODLE;
	}

}
