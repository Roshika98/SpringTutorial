/**
 * 
 */
package com.tutorials.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Roshika Perera
 *
 */
@Component
public class Car implements Vehicle {

	private Tyre carTyre;

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("This is a car. " + getCarTyre());
	}

	/**
	 * @return the carTyre
	 */
	public Tyre getCarTyre() {
		return carTyre;
	}

	/**
	 * @param carTyre the carTyre to set
	 */
	@Autowired
	public void setCarTyre(Tyre carTyre) {
		this.carTyre = carTyre;
	}

}
