package basicproblems;

/*	Input : n = 2
	Output: 5
	Explanation: 1^2+2^2 = 5
	
	Input : n = 8
	Output: 204
	Explanation :  1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 = 204 */

//4 = 1**2 + 2**2 + 3**2 + 4**2 = 30 
public class SumOfSquares {

	public static int sumOfSqr(int n) {
		int sum = 0;
		int square = 1;
		for (int i = 1; i <= n; i++) {
			square = i * i;
			sum += square;
		}
		return sum;
	}

	// Using one variable Adding One By One - O(n) Time and O(1) Space
	public static int sumSqr(int n) {
		int sum = 0;
		
		for(int i = 1; i <=n ; i++) {
			sum += (i * i);
		}
		return sum;
	}
	
	//Using Mathematical Formula - n(n+1)(2n+1) / 6 =  O(1) Time and O(1) Space
	static int sumSquare(int n) {
		return (n * (n + 1) *
				(2 * n + 1)) / 6; 
	}
	
	// We can use this formula Too (n * (n + 1) / 2) * (2 * n + 1) / 3;

	public static void main(String[] args) {
		System.out.println(sumOfSqr(8));
		
		System.out.println(sumSqr(8));
		
		System.out.println(sumSquare(8));

	}
}
