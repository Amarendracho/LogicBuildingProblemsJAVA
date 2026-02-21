package basics;

/*	Input: n = 15
	Output: false
	Explanation: 15 % 2 = 1, so 15 is odd .
	
	Input: n = 44
	Output: true
	Explanation: 44 % 2 = 0, so 44 is even.*/

public class EvenOddCheck {
	static boolean evenOddCheck(int n) {
		if (n % 2 == 1)
			return false;
		return true;

	}

	static boolean isEven(int n) {
		int rem = n % 2;

		if (rem == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(evenOddCheck(44));
		
		int number = 15;
		if(isEven(number) == true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
