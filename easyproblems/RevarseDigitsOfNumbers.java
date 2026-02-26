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

	//Reversing Digit by Digit - Time Complexity - O(log n) Space Complexity - O(1)
	public static int revarseDigits(int n) {

		int result = 0;
		while (n > 0) {
			result = (result * 10) + (n % 10);
			n /= 10;
		} 
		return result;
	}

	public static void main(String[] args) {
		System.out.println(revarseDigits(12345));
	}

}
