/*
 * Developed on: 20/04/17
 * Write and test a method that returns the minimum value in the array
 */
package Arrays;

import java.util.Arrays;

public class minimun {

	public static void main(String[] args) {
		
		int[] testA = {1,2,3,4};
		System.out.println(mini(testA));
		
		
		int[] testB = {31,56,21,-9};
		System.out.println(mini(testB));
		
		int[] testC = {-1,-2,-3,-4};
		System.out.println(mini(testC));

	}
	
	public static int mini(int[] a) {
		int minVal;
		
		Arrays.sort(a);
		
		minVal = a[0];
	
		return minVal;
	}
	
	

}
