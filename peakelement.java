package striver.binarysearch;


public class peakelement {
//162. Find Peak Element
//Medium
//9.4K
//4.3K

//A peak element is an element that is strictly greater than its neighbors.Given a 0-indexed integer array nums
//, find a peak element, and return its index. If the array contains multiple peaks, return the index 
//to any of the peaks.You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always
// considered to be strictly greater than a neighbor that is outside the array.

//You must write an algorithm that runs in O(log n) time.

//Example 1:

//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
//Example 2:

//Input: nums = [1,2,1,3,5,6,4]
//Output: 5
//Explanation: Your function can return either index number 1 where the peak element is 2,
// or index number 5 where the peak element is 6.


    public static int peAkElement(int nums[] ){
        int n = nums.length;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    // the intution behind this algorithm is preeety straight forward so first we need to find the solution in
    // the O(nlogn) and the array is sorted so what else yess binary search..
    // and after tht either the peak element wil occcur in the left of the array or in the mid of the array or 
    // in the right of the array or the arr[mid] is itself the peek element
    // case 1 : if the arr[mid]  is the peek element then its obvious tht arr[mid] > arr[mid - 1] &&
    //arr[mid] >  arr[mid + 1] so return arr[mid]
    //case 2: if it is present in the left side of the array it is greater thn the nums[mid - 1] thn move 
    // high = mid - 1
    // or low = mid + 1;
    public static void main(String[]args){
        int nums[] = { 1 ,2 , 3 , 4, 9 , 8 ,7 ,6};
        int peek_elm = peAkElement(nums);
        System.out.println("The peak element of this array is in idx  = " + peek_elm);
    }
    
}
