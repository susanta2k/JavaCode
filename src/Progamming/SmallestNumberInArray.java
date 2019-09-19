package Progamming;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		
		 int a[][] = {{10,2,3},{4,5,6},{7,8,9}};
		 int min=a[0][0];
		 for(int i=0;i<3;i++) 
		 {
			 for(int j=0;j<3;j++) 
			 {
				if(a[i][j]<min) {
					
					min=a[i][j];
				} 
				 
			 }
			 System.out.println(a[i][i]); 
		 }
	System.out.println(min);

	}

}
