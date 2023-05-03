/**
 * 
 */
package com.tutorials.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Roshika Perera
 *
 */
@Component
public class CarSale {

	private Vehicle vehicle;

	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	@Autowired
	@Qualifier("car")
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
