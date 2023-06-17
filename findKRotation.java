package striver.binarysearch;

public class findKRotation {
    public static int arrhasroated(int nums[] ){
        int low = 0;
        int high = nums.length -1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while( low <= high){
            int mid = (low + high)/2;
            if(nums[low] <= nums[high]){
                if(nums[low] < ans){
                    index = low;
                    ans = nums[low];
                    break;
                }
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] < ans){
                    index = low;
                    ans = nums[low];
                }
                low = mid + 1;

            }
            else{
                high = mid - 1;
                if(nums[mid] < ans){
                    index = mid;
                    ans = nums[mid];
                }
            }

        }
        return index;
    }
    public static void main(String[]args){
        int nums[] = {4 , 5 , 6   , 7 , 1 , 2 , 3};
        int elemfound = arrhasroated(nums);
        System.out.println("The array has been rotated  " +  elemfound + " times");
        
    }
    
}
