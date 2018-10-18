/**
 * 
 */
package com.mintree.accounts;

/**
 * @author LabAdmin
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		int result = calculator.add(2, 8);
		
		System.out.println(result);
		
		int multi = calculator.multiply(2, 8);
		
		System.out.println(multi);
	}

}
