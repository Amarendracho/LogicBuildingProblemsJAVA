package basics;

/*Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to/. 13, divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.*/

public class ClosestNumber {

	static void closeNum(int n, int m) {

		System.out.println("Input: " + "n = " + n + ", m = " + m);

		for (int i = n; i > m; i--) {
			if(i % m == 0) {
				System.out.println("output: " + i);
				return;
			}
		}
	}
	public static void main(String[] args) {
		closeNum(25,4);
	}
}


		
		
		
		