package striver.binarysearch;

public class squareRoot {
    // LEETCODE = 69
    //Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
    //The returned integer should be non-negative as well.
   //You must not use any built-in exponent function or operator
    public static int squareRoott(int n) {
        int low = 1 , high = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            int value = mid * mid;
            if(value < n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }
    // this second approach is to run in all the test cases ..!
     public static int mySqrt(int n) {
        if (n == 0) {
            return 0;
        }

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ans = n / mid;

            if (mid == ans) {
                return mid;
            } else if (mid < ans) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high; // Return high instead of low
    }
    // dont need to do much else or haath pair marne ki jarurat ni hai as the question statement says ki 
    // we need to return the closest sq root of the number and for tht we need to search and once the term search
    // comes in yesss binary search is our first priority to apply
    // so  we have to return the closest integer so it would either be present in the left side or in the right side
    // if it is present in the right sidee eleminate the left side search space and move left to mid + 1;
    // and if it is present in the left side move the right pointer into the left side nd move right pointer to
    // high = mid - 1 and once you are done with this the high pointer willbe pointing to tht integer and return it.
    public static void main(String[]args) {
        int n =  400;
        int sq_root =  squareRoott(n);
        System.out.println("The square root of this no  = " +sq_root);
    }
    
}
