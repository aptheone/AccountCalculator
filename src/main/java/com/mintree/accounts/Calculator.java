/**
 * 
 */
package com.mintree.accounts;

/**
 * @author LabAdmin
 *
 */
public class Calculator {
	
	public int add(int a, int b) {
		
		if (a<0 && b<0) {
			return a+b;
		} else {
			return a+b;
		}
		
		
	}

	public int substract(int a, int b) {
		if(a>=b) {
			return a-b;	
		}else {
			return b-a;
		}
		
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public double divide(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		else {
			return 0.0;
		}
	}
}
