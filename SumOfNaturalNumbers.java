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

	// approach 2 formula SumOfNnatural 
	static int sumOfN(int n) {
		return (n * (n + 1) / 2);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfNums(n));
		
		// approach 2 
		System.out.println(sumOfN(4));
	}

}
