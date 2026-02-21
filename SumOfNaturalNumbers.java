package basics;

/*	Input: n = 3
	Output: 6
	Explanation: 1 + 2 + 3 = 6
	
	Input: n = 5
	Output: 15 
	Explanation:  1 + 2 + 3 + 4 + 5 = 15*/

public class SumOfNaturalNumbers {

	// Using Loop - O(n) Time and O(1) Space
	public static int sumOfNums(int n) {

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	// approach 2 formula SumOfNnatural O(1) Time and O(1) Space
	static int sumOfN(int n) {
		return (n * (n + 1) / 2);
	}

	// Approach 3 Using Recursion -O(n) and O(n) Space
	public static int sumOfNNums(int n) {

		// base condition
		if (n == 1)
			return 1;

		return n + sumOfNNums(n - 1);
	} 

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfNums(n));

		// approach 2
		System.out.println(sumOfN(4));
		
		//approach 3
		System.out.println(sumOfNNums(5));
		
		
	}

}
