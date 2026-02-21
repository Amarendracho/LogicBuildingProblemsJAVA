package basics;

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

	public static void main(String[] args) {
		System.out.println(sumOfSqr(8));

	}
}
