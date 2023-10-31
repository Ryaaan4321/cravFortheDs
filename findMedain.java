package striver.binarysearch;
https://leetcode.com/problems/median-of-two-sorted-arrays/

public class medianOftwoArr {
    public static double findMedian(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2) {
            return findMedian(nums2, nums1);
        }

        int m = n1 + n2;
        int left = (n1 + n2 + 1) / 2;// because it works for all the conditions possibly 
        int low = 0;
        int high = n1; // becuse tht how shit works

        while (low <= high) { // Change the condition to include equality
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1; // Fixed the assignment operator

            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE; // the minimum value of the arr1 is our value
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE; // the minimum value of the arr2 is our value
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;// the max of the arr1 is our friend
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;// the max of the arr2 id our friend

            if (l1 <= r2 && l2 <= r1) {
                if (m % 2 == 1) { // if the number of the elements of the both the array are odd then this
                    return (double) Math.max(l1, l2);
                } else { // otherwise then this 
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                }
            } else if (l1 > r2) { // if in case l1> r2 then make the high = mid-1
                high = mid1 - 1;
            } else { // and else this
                low = mid1 + 1;
            }
        }
        return 0.0; // Return 0.0 as the default median
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3, 4 };
        int nums2[] = { 2, 4 };

        double ans = findMedian(nums1, nums2);
        System.out.println(ans);
    }
}
