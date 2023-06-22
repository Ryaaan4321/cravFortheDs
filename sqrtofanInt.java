package striver.binarysearch;

public class sqrtofanInt {
    // returning 0 if ans == 0
    // returning 1 if ans == m
    // returining 2 if ans => m  
    public static int func1(long n, long m, long mid) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }

    public static long func2(long n, long m) {
        if (m == 0) return 0;
         // Handling edge case where m is 0
        if (n == 0 || m == 1) return m;
         // Handling edge cases where n is 0 or m is 1

        long low = 1;
        long high = m;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long midN = func1(n, m, mid);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high; 
    }
    // need a  hard drive revision for this questionnnn

    public static void main(String[] args) {
        long n = 2;
        long m = 10;
        long ans = func2(n, m);
        System.out.println("The square root of this number = " + ans);
    }
}
