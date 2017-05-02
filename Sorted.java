/*
 * Developed on: 20/04/17
 * Write and test a method that checks if an array is sorted 
 */

package Arrays;

public class Sorted {

	public static void main(String[] args) {
		
		int[] testA = {1,2,3,4};
		System.out.println(isSorted(testA));
		
		int[] testB = {2,1,3};
		System.out.println(isSorted(testB));
				
		int[] testC = {1,1,5,8,12};
		System.out.println(isSorted(testC));
		
		int[] testD = {10000,2,-1000,5};
		System.out.println(isSorted(testD));
		
		int[] testE = {0};
		System.out.println(isSorted(testE));
		
		int[] testF = {0,1,3,5,4};
		System.out.println(isSorted(testF));
		
	}
	
	
	static boolean isSorted(int[] a) {
		boolean isSorted = false; 
		int len = a.length;
		int min = Integer.MIN_VALUE;
		
		for(int i =0; i < len; i++){
			if(a[i] >= min) {
				min = a[i];
				isSorted = true;
			} else {
				isSorted = false;
				return isSorted;
			}
			
		}
		
		return isSorted;

	}

}
