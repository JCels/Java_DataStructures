/*
 * Developed on: 20/04/17
 * Write and test a method that the average of the numbers in an array
 */


package Arrays;

public class averageSum {

	public static void main(String[] args) {
	
		double[] testA = {1.0,3.4,2.1};
		System.out.println(mean(testA));
		
		double[] testB = {0,0,0,0,5};
		System.out.println(mean(testB));
		
		double[] testC = {1,3,2};
		System.out.println(mean(testC));



	}
	
	public static double mean(double[] a){
		double mean = 0; 
		double sum = 0;
		
		for(int i= 0; i< a.length; i++){
			sum += a[i];
		}
		
		mean = (sum/a.length) ;
	
		return mean; 
	}

}
