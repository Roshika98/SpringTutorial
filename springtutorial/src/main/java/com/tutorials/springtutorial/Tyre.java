/**
 * 
 */
package com.tutorials.springtutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Roshika Perera
 *
 */
@Component
public class Tyre {

	private String brand;

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	@Value("${tyre.type}")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre type is " + brand;
	}

}
