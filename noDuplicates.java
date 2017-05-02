/*
 * Developed on: 21/04/17
 * Write and test a method that removes duplicates from an array 
 */

package Arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noDuplicates {

	public static void main(String[] args) {
		
		int[] testA = {1,2,3,4};
		withoutDuplicates(testA);
		
		System.out.println();
		int[] testB = {1,2,3,1};
		withoutDuplicates(testB);

		
		System.out.println();
		int[] testC = {1,2};
		withoutDuplicates(testC);
		
		System.out.println();
		int[] testD = {1};
		withoutDuplicates(testD);
		
		System.out.println();
		int[] testE = {1,1,1,1};
		withoutDuplicates(testE);
	}

	public static  int[] withoutDuplicates(int[] a) {

		int n = a.length;
		for(int i =0; i < n-1; i++){
			for(int j=i+1; j< n; j++){
				if(a[j] == a[i]){
					--n;
					System.arraycopy(a, j+1, a, j, n-j);
					--j;
				}
			}
		}
		int[] b = new int[n];
		System.arraycopy(a, 0, b, 0, n);
		
		for(int x = 0; x< b.length; x++){
			System.out.print(b[x]);
		}
		return b;
	}

}
