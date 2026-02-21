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

	public static void main(String[] args) {
		System.out.println(evenOddCheck(44));
	}

}
