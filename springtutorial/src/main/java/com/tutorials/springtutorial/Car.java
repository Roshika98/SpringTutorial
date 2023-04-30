/**
 * 
 */
package com.tutorials.springtutorial;

import org.springframework.stereotype.Component;

/**
 * @author Roshika Perera
 *
 */
@Component
public class Car implements Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("This is a car");
	}

}
