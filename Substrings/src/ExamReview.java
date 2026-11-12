
public class ExamReview {

	public static int question1(int x) {
		if (x>=50)
			return x/2;
		if (x<=65) 
			return x*2;
		return x;
	}

	public static int question1(int x, int y) {
		return question1(x) + question1(y);
	}

	public static int[] q2(int x, int[]y) {
		for (int i =0; i<y.length; i++) {
			if (y[i]%x==0) {
				y[i]=0;
			}
		}
		return y;
	}
	
	// know string methods
	
	public static void main(String[] args) {

		int a = question1(100);
		// 50
		int b = question1(60);
		// 30 
		// return kills the program - don't multiply

		int c = question1(100, 60);
		// 50 + 30 = 80

		int d = question1(5,10);
		// 5 * 2 = 10
		// 10 * 2 = 20
		// 10 + 20 = 30;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);



		String name = "Kyle Steven Dencker";

		// 2 = starts at index 2 
		// "le Steven Dencker"
		System.out.println(name.substring(2));

		// 0,2 = starts at index 0, ends right before index 2 (not including 2) 
		// "Ky"
		System.out.println(name.substring(0,2));

		// starts at 2, goes unitl end of name, not including last 2 indices
		// "le Steven Denck"
		System.out.println(name.substring(2,name.length()-2));

		// combines [0,5) with last 7 letters
		// "Kyle Dencker"
		String combined = name.substring(0,5) + name.substring(name.length()-7);
		System.out.println(combined);

		// combines [0,2) with last 2 letters
		// "Kyer"
		String combined2 = name.substring(0,2) + name.substring(name.length()-2);
		System.out.println(combined2);
		
		String word = "Hello";
		String upper = word.toUpperCase();  // "HELLO"
		System.out.println(""+upper);
		
		String lower = word.toLowerCase();
		System.out.println(""+lower);
		
		String word1 = "apple";
		int result1 = word1.compareTo("apricot");
		System.out.println(""+result1);
		
		String word2 = "banana";
		int result2 = word2.compareTo("banana");
		System.out.println(""+result2);
		
		String word3 = "cherry";
		int result3 = word3.compareTo("blueberry");
		System.out.println(""+result3);
		
		String word4 = "grape";
		int result4 = word4.compareTo("grapefruit");
		System.out.println(""+result4);
		
		String word5 = "orange";
		int result5 = word5.compareTo("mango");
		System.out.println(""+result5);

		String word6 = "pear";
		int result6 = word6.compareTo("peach");
		System.out.println(""+result6);
		
		String word7 = "apple";
		int result7 = word7.compareTo("banana");
		System.out.println(""+result7);
		
		String word8 = "watermelon";
		int result8 = word8.compareTo("water");
		System.out.println(""+result8);

		String word9 = "pineapple";
		int result9 = word9.compareTo("apple");  // 4
		// apple starts at the 4th index of pineapple. 
		System.out.println(""+result9);
	
		int length = ("Hello, world!").length();
		System.out.println(""+length);








		


	}

}
