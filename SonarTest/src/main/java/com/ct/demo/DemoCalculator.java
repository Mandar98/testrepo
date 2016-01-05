/**
 * 
 * This is a test class to demo Sonar Integration with Jenkins.
 * 
 * @author mandarn
 * @since 11 November 2014
 */

package com.ct.demo;

public class DemoCalculator {

	/**
	 * Private constructor of class
	 */
	private DemoCalculator() {
		
	}
	
	/**
	 * 
	 * @param a :<code>Integer</code> containing first value for the mathematical operation.
	 * @param b :<code>Integer</code> containing second value for the mathematical operation.
	 * @return <code>Integer</code> containing addition of the two supplied <code>Integer</code> arguments.
	 */
	public static int add(int a, int b) {
		// Add the parameters and return the results.
		return a + b;
	}
	
	/**
	 * 
	 * @param a :<code>Integer</code> containing first value for the mathematical operation.
	 * @param b :<code>Integer</code> containing second value for the mathematical operation.
	 * @return <code>Integer</code> containing multiplication of the two supplied <code>Integer</code> arguments.
	 */
	public static int multiply(int a, int b) {
		// Multiply the parameters and return the results.
		return a * b;
	}
}
