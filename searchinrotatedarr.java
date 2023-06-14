package striver.binarysearch;

public class searchinrotatedarr {
    public static int searchinarr(int nums[] , int target){
        for(int i = 0 ; i < nums.length -1; i++){
            if(nums[i] == target) {
                return nums[i];
            }
        }
        return -1;
    }
     public static int search(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[low]){
                if(nums[low] <= target && nums[mid] >= target){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
           

        }
        return -1;
    }
   public static void main(String[]args){
    int nums[] = { 8 , 7, 6 , 1 , 2 , 3 ,4 ,5};
    int target = 8;
    System.out.print("the element found at " + searchinarr(nums, target));
   }
}
