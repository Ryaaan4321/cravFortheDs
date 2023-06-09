package striver.binarysearch;

import java.util.*;

public class lowerBunnd {
    public static int lowerBound(int arr[] , int  target , int n){
        // intializing two pointers high and low..
         int low = 0 ; 
         int high = n-1;
         int ans = n ;
  // searching tilll this conditon..!
         while( low <= high){
          int  mid = (low + high)/2;
          if(arr[mid] >= n){
            ans = mid;
            high = mid -1;
          }else{
            low = mid + 1;
          }
          //return ans;
          
       }
         return ans;
    }
 public static int recLowerbound(int arr[], int low, int high, int target) {
    // base condition
    if (low > high) return -1;

    // mid
    int mid = low + (high - low) / 2;

    if (target < arr[mid]) {
        return recLowerbound(arr, low, mid - 1, target);
    } else if (target > arr[mid]) {
        return recLowerbound(arr, mid + 1, high, target);
    } else {
        // Check if the current mid is the lower bound
        if (mid == 0 || arr[mid - 1] < target) {
            return mid;
        } else {
            return recLowerbound(arr, low, mid - 1, target);
        }
    }
}

public static int reclow(int arrr[], int target) {
    int low = 0, high = arrr.length - 1;
    return recLowerbound(arrr, low, high, target);
}

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 6, 7};
    Arrays.sort(arr);
    int target = 2;

    System.out.print(" THe index of the target element is = ");

    System.out.println(reclow(arr, target));
}
}