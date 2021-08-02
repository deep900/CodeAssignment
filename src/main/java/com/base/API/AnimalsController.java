/**
 * 
 */
package com.base.API;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.base.animal.Animal;
import com.base.birds.Bird;

/**
 * @author Pradheep
 *
 */
@RestController
public class AnimalsController {

	/**
	 * This is a Mock method to obtain a animal by ID.
	 * Actual implementation will have a DB call to fetch animal by id.
	 * 
	 * @param id
	 * @return
	 */
	public List<Animal> getAnimal(int id) {
		// Mock DB Call.
		Animal[] animals = new Animal[] { new Bird() };
		return Arrays.asList(animals);
	}

	@GetMapping
	public @ResponseBody List<Animal> getAnimalById(@RequestParam int id) {
		return getAnimal(id);
	}
}
