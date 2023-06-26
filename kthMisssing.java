package striver.binarysearch;

public class kthMisssing {
    public static int kthMissing(int nums[], int k){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = nums[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    

        
    }
    public static  void main(String[]args){
        int nums[] = { 2  , 3 ,4 , 6 ,8};
        int k = 1;
        int missinNumber = kthMissing(nums, k);
        System.out.print("The kth missing number in this array = " + missinNumber);
    }

    
}
