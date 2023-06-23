package striver.binarysearch;
https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

import java.util.Arrays;

public class smallestDivisor {
    
    public static int sumByd(int[] arr, int div) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) arr[i] / div);
        }
        return sum;
    }
    
    public static int smallestDiv(int[] arr, int limit) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt(); // Calculate the maximum value in the array

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByd(arr, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int limit = 10;
        int result = smallestDiv(arr, limit);
        System.out.println("Smallest divisor: " + result);
    }
}
