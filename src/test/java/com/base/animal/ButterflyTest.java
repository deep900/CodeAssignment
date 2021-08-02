/**
 * 
 */
package com.base.animal;

import org.junit.Test;

import com.base.fly.Butterfly;

import junit.framework.Assert;

/**
 * @author Pradheep
 *
 */
public class ButterflyTest {
	
	Butterfly butterflyObj = new Butterfly(false);
	Butterfly caterpillarObj = new Butterfly(true);

	@Test
	public void caterpillarTest(){
		Assert.assertEquals(ApplicationConstants.DONTFLY, caterpillarObj.fly());
		Assert.assertEquals(ApplicationConstants.CRAWL, caterpillarObj.walk());
	}
	
	@Test
	public void butterFlyTest(){
		Assert.assertEquals(ApplicationConstants.IDONTWALK, butterflyObj.walk());
		Assert.assertEquals(ApplicationConstants.FLYING, butterflyObj.fly());
	}
}
