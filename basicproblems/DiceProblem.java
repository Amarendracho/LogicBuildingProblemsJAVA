package basicproblems;

/*	Input: n = 2
	Output: 5
	Explanation: For dice facing number 5 opposite face will have the number 2.
	
	1 - 6
	2 - 5
	3 - 4 
	
	Input: n = 6
	Output: 1
	Explanation: For dice facing number 6 opposite face will have the number 1.*/

public class DiceProblem {

	static int dicePick(int n) {
		int res;

		if (n == 1) {
			res = 6;
		} else if (n == 2) {
			res = 5;
		} else if (n == 3) {
			res = 4;
		} else if (n == 4) {
			res = 3;
		} else if (n == 5) {
			res = 2;
		} else {
			res = 1;
		}
		return res;
	}

}
