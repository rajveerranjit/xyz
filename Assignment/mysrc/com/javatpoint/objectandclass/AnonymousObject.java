/**Anonymous object
 * 
 */
package com.javatpoint.objectandclass;

/**
 * @author RAJVEER
 *
 */

class Factorial{
	
	
	void calculateFactorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
		fact=fact*i;
		}
		
		System.out.println(fact);
	}
	
}

public class AnonymousObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	new  Factorial().calculateFactorial(6);   //If you have to use an object only once, anonymous object is a good approach

	}

}
