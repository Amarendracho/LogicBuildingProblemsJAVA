package basics;

/*	Input: 5
	Output: 
	5 * 1 = 5
	5 * 2 = 10
	5 * 3 = 15
	5 * 4 = 20
	5 * 5 = 25
	5 * 6 = 30
	5 * 7 = 35
	5 * 8 = 40
	5 * 9 = 45
	5 * 10 = 50*/

public class MultiplicationTable {

	// Iterative Approach T - O(1) S - O(1)
	public static void mulTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	public static void main(String[] args) {
		mulTable(2);
	}

}
