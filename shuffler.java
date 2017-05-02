package Arrays;

import java.util.Random;

public class shuffler {

	public static void main(String[] args) {
		
		Object[] testA = {1,2,3,4,5};
		shuffle(testA);
		
		

	}
	
	private static void shuffle(Object[] a) {
		
		Random random = new Random();
		int len = a.length;
		
		for(int i=len; i>1; i--){
			swap(a, i-1, random.nextInt(i));
		}
		
		print(a);		
		
	}

	private static void print(Object[] a) {
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]);
		}	
	}

	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
