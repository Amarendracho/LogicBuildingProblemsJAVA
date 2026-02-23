package basicproblems;

/*Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to/. 13, divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.*/

public class ClosestDivisibleOptimized {

    public static long closestDivisible(long n, long m) {
        if (m == 0) throw new IllegalArgumentException("m cannot be 0");
        long absM = Math.abs(m);

        long q = Math.floorDiv(n, absM);   // correct for negatives
        long lower = q * absM;
        long upper = lower + absM;

        long distLower = Math.abs(n - lower);
        long distUpper = Math.abs(upper - n);

        if (distLower < distUpper) return lower;
        if (distUpper < distLower) return upper;

        // tie -> maximum absolute value
        return (Math.abs(lower) >= Math.abs(upper)) ? lower : upper;
    }

    public static void main(String[] args) {
        System.out.println(closestDivisible(13, 4));    // 12
        System.out.println(closestDivisible(-15, 6));  // -18
    }
}


		
		
		
		