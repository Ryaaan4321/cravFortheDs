package striver.binarysearch;

public class kthMisssing {
    public static int kthMissing(int nums[], int k){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = nums[mid] - (mid + 1); // in case of 0 bassed indexing ;
          //  int missing = nums[mid] - (mid) ;    // in cases of 1 bassed indexing;
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
        // take that case in your mind tht this will give us the the ans(or tht missing number)..!

        // ans = arr[high] + more;
        // more = k - missing
        // missing = arr[high] - (high + 1);
        // ans = arr[high] + k - missing
        // ans = arr[high] + k - arr[high] + high + 1' 
        // ans = high + k + 1;
        // if u can see low comes to in the opposite polarity of the high 
        // and which can be wriiten as low = high + 1;
        // ans = low in place of(high + 1) + k;
    

        
    }
    public static  void main(String[]args){
        int nums[] = { 2  , 3 ,4 , 6 ,8};
        int k = 1;
        int missinNumber = kthMissing(nums, k);
        System.out.print("The kth missing number in this array = " + missinNumber);
    }

    
}
