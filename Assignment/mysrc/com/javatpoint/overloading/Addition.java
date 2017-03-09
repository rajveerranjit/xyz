/**
 * 
 */
package com.javatpoint.overloading;

/**
 * @author RAJVEER
 *
 */
public class Addition {

	int caladdition(int a,int b,int c){
		return(a+b+c);
	}
	
	int caladdition(int a,int b){
		return(a+b);
	}
	
	long caladdition(long a,int b){
		return(a+b);
	}
	
	/*long caladdition(int b,long a){
		return(a+b);
	}*/
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addition ad=new Addition();
		int i=ad.caladdition(1, 5);
		int j=ad.caladdition(5, 10,7);
		System.out.println(i+" "+j);
		
		System.out.println(ad.caladdition(3, 5));
		System.out.println(ad.caladdition(20, 30));

	}

}
