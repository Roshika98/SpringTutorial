/**
 * 
 */
package com.tutorials.springtutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Roshika Perera
 *
 */
@Configuration
@ComponentScan(basePackages = "com.tutorials.springtutorial")
@PropertySource("classpath:com/tutorials/springtutorial/config.properties")
public class Config {

//	@Bean
//	public Vehicle getVehicle() {
//		return new Car();
//	}
//
//	@Bean
//	public Tyre geTyre() {
//		return new Tyre();
//	}
}
