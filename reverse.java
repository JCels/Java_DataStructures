package Arrays;

public class reverse {

	public static void main(String[] args) {
		
		int[] testA = {1,2,5};
		reverseM(testA);

	}
	
	
	static void reverseM(int[] a) {
		
		int[] b = new int[a.length];
		int x = a.length-1;
		//System.out.println(x);
		
		for(int i = 0; i< a.length; i++){
			b[x] = a[i];
			if(x != -1){
				x--;
			} else 
				break;	
		}
		
		for(int j = 0; j<b.length;j++){
			System.out.print(b[j]);
		}
	}

}
