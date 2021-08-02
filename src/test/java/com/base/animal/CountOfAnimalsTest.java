/**
 * 
 */
package com.base.animal;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.base.behaviour.Flyable;
import com.base.behaviour.Singer;
import com.base.behaviour.Swimmer;
import com.base.birds.Bird;
import com.base.birds.Chicken;
import com.base.birds.Duck;
import com.base.birds.Parrot;
import com.base.birds.Rooster;
import com.base.fish.Clownfish;
import com.base.fish.Dolphin;
import com.base.fish.Fish;
import com.base.fish.Shark;
import com.base.fly.Butterfly;

/**
 * @author Pradheep Problem D.
 *
 */
public class CountOfAnimalsTest {

	Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(),
			new Shark("large", "grey", true), new Clownfish("small", "orange", true), new Dolphin(),
			new Butterfly(false) };

	@Test
	public void countAnimalsThatFly() {
		List<Animal> animalsList = Arrays.asList(animals);
		long countOfAnimalsCanFly = animalsList.stream().filter(animal -> animal instanceof Flyable).count();
		System.out.println("Number of animals that can fly" + countOfAnimalsCanFly);
		Assert.assertEquals(2, countOfAnimalsCanFly);
		// Bird and Butterfly can fly in this case.
	}
	
	@Test
	public void countAnimalsThatWalk(){
		List<Animal> animalsList = Arrays.asList(animals);
		long countOfAnimalsCanWalk = animalsList.stream().filter(animal -> animal.walk().equalsIgnoreCase(ApplicationConstants.WALKING)).count();
		System.out.println("Number of animals that can walk:" + countOfAnimalsCanWalk);
		Assert.assertEquals(6, countOfAnimalsCanWalk);
	}
	
	@Test
	public void countAnimalsThatSing(){
		List<Animal> animalsList = Arrays.asList(animals);
		long countOfAnimalsCanSing = animalsList.stream().filter(animal -> animal instanceof Singer).count();
		System.out.println("Number of animals that can sing:" + countOfAnimalsCanSing);
		Assert.assertEquals(1, countOfAnimalsCanSing);
	}
	
	@Test
	public void countAnimalsThatSwim(){
		List<Animal> animalsList = Arrays.asList(animals);
		long countOfAnimalsCanSwim = animalsList.stream().filter(animal -> animal instanceof Swimmer).count();
		System.out.println("Number of animals that can swim:" + countOfAnimalsCanSwim);
		Assert.assertEquals(5, countOfAnimalsCanSwim);
	}
}
