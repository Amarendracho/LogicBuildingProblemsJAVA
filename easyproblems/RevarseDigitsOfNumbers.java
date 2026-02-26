package easyproblems;

/*	Input: n = 122
	Output: 221
	Explanation: By reversing the digits of number, number will change into 221.
	
	Input: n = 200
	Output: 2
	Explanation: By reversing the digits of number, number will change into 2.
	
	Input: n = 12345 
	Output: 54321
	Explanation: By reversing the digits of number, number will change into 54321.*/

public class RevarseDigitsOfNumbers {

	// Reversing Digit by Digit - Time Complexity - O(log n) Space Complexity - O(1)
	public static int revarseDigits(int n) {

		int result = 0;
		while (n > 0) {
			result = (result * 10) + (n % 10);
			n /= 10;
		}
		return result;
	}

	// Using String - O(log n) Space Complexity - O(1)
	static int reversDigits(int n) {
		// converting number to string
		StringBuffer s = new StringBuffer(String.valueOf(n));

		// reversing the string
		s.reverse();

		// converting string to integer
		n = Integer.parseInt(String.valueOf(s));

		// returning integer
		return n;
	}

	public static void main(String[] args) {
		System.out.println(revarseDigits(12345));
		
		System.out.println(reversDigits(12345));
	}

}
