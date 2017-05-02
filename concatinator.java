package Arrays;

public class concatinator {

	public static void main(String[] args) {
		
		//Test the method 
		Object[] a= {"a", "b", "c","z","y","x"};
		Object[] b= {"d", "e", "f", "g","h"};
		concatinate(a,b);
		System.out.println();
		
		Object[] c= {1,2,3,4,5,6,7,8,9};
		Object[] d= {10,11,12,13,14};
		concatinate(c,d);

	}
	
	public static void concatinate(Object[] a, Object[] b) {
		
		int len = a.length + b.length;
		
		Object[] c = new Object[len];
		
		//Copy the two arrays into the new array
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		//Print the array 
		for(int i=0; i < len; i++){
			System.out.print(c[i]);
		}
	}

}
