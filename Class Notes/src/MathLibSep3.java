
public class MathLibSep3 {

	// don't need to import math class
	
	public static void main(String[] args) {
		int a = Math.abs(-4);
		System.out.println(a);
		double b = Math.abs(-4.78);
		System.out.println(b);
		
		// 2^5
		Math.pow(2, 5); 
		
		// works just like C's where we generate a number 0-1
		System.out.println(Math.random()); 
		System.out.println(Math.random()); 
		
		// getting int
		System.out.println(Math.floor(Math.random()*6)); 
		System.out.println((int)(Math.random()*6)+1); 
		
		// Math.random gives a number b/w [0, 1)
		// [0,1) * 6 we get [0*6, 1*6)
		// [0,6) add 1 to it
		// [1,7)
		// casting it down (floor) or making it int - 1, 2, 3, 4, 5, 6

		// square root
		Math.sqrt(64); 
		
		// rounds DOWN
		System.out.println(Math.floor(-1.3));
		
		// rounds UP
		System.out.println(Math.ceil(-1.3));
		System.out.println(Math.ceil(6.9));
		
		// normal round
		System.out.println(Math.round(4.3));
		System.out.println(Math.round(4.8));

		// integer division truncates
		System.out.println(-13/10);

	}

}
