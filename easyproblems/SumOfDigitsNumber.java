package easyproblems;

/*	Input: n = 687
	Output: 21
	Explanation: The sum of its digits are: 6 + 8 + 7 = 21
	
	Input: n = 12
	Output: 3
	Explanation: The sum of its digits are: 1 + 2 = 3*/

public class SumOfDigitsNumber {
	
	//Digit Extraction - O(log10n) Time and O(1) Space
	public static int sumOfNumbers(int num) {

		int sum = 0;
		while (num > 0) {
			int remainder = num % 10;
			sum += remainder; 
			num /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(sumOfNumbers(6756));
	}
}
