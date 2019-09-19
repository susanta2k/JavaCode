package Progamming;

public class Fibonnaci {
public static void main (String[] args){
		
		int a= 0, b = 1, c=0 ;
		int count = 100;
		
		System.out.println(a);
		System.out.println(b);
		for(c=0;c<=count;c++){
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
									
		}
}
}


