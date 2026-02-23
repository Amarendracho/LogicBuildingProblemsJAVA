package basicproblems;

/*	Input: n = 15
	Output: false
	Explanation: 15 % 2 = 1, so 15 is odd .
	
	Input: n = 44
	Output: true
	Explanation: 44 % 2 = 0, so 44 is even.*/

public class EvenOddCheck {
	
	// Approach 1
	static boolean evenOddCheck(int n) {
		if (n % 2 == 1)
			return false;
		return true;

	}

	// Approach 2
	static boolean isEven(int n) {
		int rem = n % 2;

		if (rem == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Using Bitwise AND Operator - O(1) Time and O(1) Space
	public static boolean isEvenCheck(int n) {
		if ((n & 1) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Approach 1
		System.out.println(evenOddCheck(44));

		// Approach 2
		int number = 15;
		if (isEven(number) == true)
			System.out.println("true");

		else
			System.out.println("false");

		// Approach 3
		int n = 114;
		if (isEvenCheck(n) == true)
			System.out.print("true");
		else
			System.out.print("false");
	}

}
