package basicproblems;

/*	Input : a1 = 2,  a2 = 3,  n = 4
	Output : 5
	Explanation : The series is 2, 3, 4, 5, 6, ....   , thus the 4th term is 5.
	
	Input : a1 = 5, a2 = 6, n = 7
	Output : 11
	Explanation:  The series is: 5, 6, 7, 8, 9, 10, 11, 12..... Thus,7th term is 11.
	
	Input : a1 = 1, a2 = 3, n = 10
	Output : 19
	Explanation:  The series is: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21..... Thus,10th term is 19.
*/
public class NthTeamFrom1stand2 {

	// Using for Loop - O(n) O(1)
	static int nthTerm(int a1, int a2, int n) {

		int nthElement = a1, d = a2 - a1;
		for (int i = 1; i < n; i++) {
			nthElement += d;
		} 
		return nthElement;
	}

	// Using the Formula for nth Term - O(1) O(1)
	static int nthTermOfAP(int a1, int a2, int n) {
		// using formula to find the Nth term t(n) = a(1) + (n-1)*d
		return (a1 + (n - 1) * (a2 - a1));
	}

	public static void main(String[] args) {
		int a1 = 1, a2 = 3, n = 10;
		System.out.println(nthTerm(a1, a2, n));
		System.out.println(nthTermOfAP(a1, a2, n));

	}
}
