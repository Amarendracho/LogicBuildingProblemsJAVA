package basics;

/*	Input: a = 2, b = 3
	Output: a = 3, b = 2
	
	Input: a = 20, b = 0
	Output: a = 0, b = 20
	
	Input: a = 10, b = 10
	Output: a = 10, b = 10 */

public class SwapTwoNumbers {

	static void swap(int a, int b) {
		System.out.println("a = "+ a +", b = "+ b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+ a +", b = "+ b);
	}

	public static void main(String[] args) {
		swap(20,0);
	}
}
   