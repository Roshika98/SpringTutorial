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
public class Bike implements Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("This is a Bike");
	}

}
