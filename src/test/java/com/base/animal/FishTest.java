/**
 * 
 */
package com.base.animal;

import org.junit.Test;

import com.base.fish.Clownfish;
import com.base.fish.Dolphin;
import com.base.fish.Shark;

import junit.framework.Assert;

/**
 * @author Pradheep
 *
 */
public class FishTest {
	
	Shark sharkObj = new Shark("large","grey",true);
	Clownfish clownFishObj = new Clownfish("small", "orange", true);
	Dolphin dolphinFishObj = new Dolphin();
	
	@Test
	public void sharkTest(){
		Assert.assertEquals("large", sharkObj.getSize());
		Assert.assertEquals("grey", sharkObj.getColor());
		Assert.assertEquals(true, sharkObj.isCanEatOtherFish());
	}
	
	@Test
	public void clownFishTest(){
		Assert.assertEquals("small", clownFishObj.getSize());
		Assert.assertEquals("orange", clownFishObj.getColor());
		Assert.assertEquals(true, clownFishObj.isCanMakeJokes());
	}
	
	@Test
	public void dolphinTest(){
		Assert.assertEquals(ApplicationConstants.SWIMMING, dolphinFishObj.swim());
	}
}
