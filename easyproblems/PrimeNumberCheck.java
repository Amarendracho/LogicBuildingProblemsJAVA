package easyproblems;

/*	Input:  n = 11
	Output: true
	
	Input:  n = 15
	Output: false
	
	Input:  n = 1
	Output: false */

public class PrimeNumberCheck {

	// Time complexity: O(n) Auxiliary Space: O(1)
	static boolean primrCheck(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(primrCheck(1));
	}

}
