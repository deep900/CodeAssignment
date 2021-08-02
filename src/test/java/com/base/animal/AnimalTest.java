package com.base.animal;

import org.junit.Before;
import org.junit.Test;

import com.base.birds.Bird;
import com.base.birds.Chicken;
import com.base.birds.Parrot;
import com.base.birds.Rooster;

import junit.framework.Assert;

public class AnimalTest {

	Chicken chickenObj = new Chicken();
	Bird birdObj = new Bird();
	Rooster roosterObj = new Rooster();
	Parrot parrotObj = new Parrot();
	
	@Before
	public void init(){
		
	}
	
	@Test
	public void chickenTest(){
		System.out.println(chickenObj.makeSound());
		Assert.assertEquals(ApplicationConstants.CLUCK_SOUND, chickenObj.makeSound());
	}
	
	@Test
	public void birdFlyTest(){
		System.out.println(birdObj.fly());
		Assert.assertEquals(ApplicationConstants.FLYING, birdObj.fly());
	}
	
	@Test
	public void birdSingTest(){
		
		Assert.assertEquals(ApplicationConstants.SINGING, birdObj.sing());
	}
	
	@Test
	public void roosterTest(){
		Assert.assertEquals(ApplicationConstants.COCK_A_DOODLE, roosterObj.makeSound());
	}
	
	@Test
	public void parrotTest1(){
		parrotObj.setParrotType(ApplicationConstants.PARROT_LIVING_WITH_CAT);
		Assert.assertEquals(ApplicationConstants.PARROT_LIVING_WITH_CAT, parrotObj.makeSound());
	}
	
	@Test
	public void parrotTest2(){
		parrotObj.setParrotType(ApplicationConstants.PARROT_LIVING_WITH_DOG);
		Assert.assertEquals(ApplicationConstants.PARROT_LIVING_WITH_DOG, parrotObj.makeSound());
	}
	
	@Test
	public void parrotTest3(){
		parrotObj.setParrotType(ApplicationConstants.PARROT_LIVING_WITH_ROOSTER);
		Assert.assertEquals(ApplicationConstants.PARROT_LIVING_WITH_ROOSTER, parrotObj.makeSound());
	}
}
