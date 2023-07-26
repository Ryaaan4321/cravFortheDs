package striver.striver;

import java.util.*;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

public class maximumcount {
    public static int maximumCount(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>(n);
        int countn = 0;
        int countz = 0;
        int countp = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                countn++;
                ans.add(countn);
            } else if (nums[i] == 0) {
                countz++;
                ans.add(countz);
            } else {
                countp++;
                ans.add(countp);
            }
        }
        int nn = Collections.max(ans);
        return nn;
        // this part of code is working fine in the vs code for all the test cases bt i dont know  why it shows compilation error on leetcode well fuck tht 
        // T.C = (O (N))

    }

    public static int maximumCount1(int[] nums) {
        int n = nums.length;
        if (nums[0] == 0 && nums[n - 1] == 0)
            return 0;
        int low = 0;
        int high = nums.length;
        int countZeros = 0;
        // Binary search
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == 0) {
                countZeros++;
                low = mid + 1;
            } else if (nums[mid] > 0) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        // Get the max of lo - 0 and len - lo
        return Math.max(low - countZeros, n - low);
        // T.C = (O (nlogn))
        // S.C = no extra space used to solve this questionnnn
    }

    public static void main(String[] args) {
        int nums[] = { -3, -2, -1, -4, -2, 0, 0, 1, 2 };
        int anss = maximumCount(nums);
        System.out.println(" The maximum count in this array  is of " + anss + " elements ");
    }

}
