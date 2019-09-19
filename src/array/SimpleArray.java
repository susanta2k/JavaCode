package array;

public class SimpleArray {
	
	
	
	public static void main(String[] args) {
		
		int[] x = new int[10];
		x[0] = 10;
		x[2] = 20;
		x[3] = 30;
		x[4] = 40;
		x[5] = 50;
		x[9] = 100;
	System.out.println(x.length);
	
	for (int i=0; i< x.length; i++) {
		System.out.println(x[i]);
	}
	
	/*for (int temp: x) {
		System.out.println(temp);
			
		}
		*/
		
	}

}
