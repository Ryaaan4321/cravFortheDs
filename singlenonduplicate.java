package striver.binarysearch;

public class singleleminarr {
    public static int singlenonduplicate(int nums[]){
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n - 1] != nums[n - 2] ) return  nums[n - 1];

        int low = 0 , high =  n - 2;

        while(low <= high){
            int mid = (low + high) /2;
            if( nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if(mid % 2 == 1 && nums[mid] == nums[mid - 1] && mid % 2 == 0 && nums[mid] == nums[mid + 1]){
                low = mid + 1;

            } else{
                high  = mid - 1;
            }
        }
        return - 1;
    }
    // bcs in the last appproach we are running t two conditions inside the if conditiond 
    // nd there are some chances when it didnt enter into it so for tht condition this 2nd method will run smoothly like  a makhaan..!
    
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
                            
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        
        return nums[low];
    }


     public static void main(String[]args){
        int nums[] = {4 , 4 , 6   , 6 , 1 , 1 , 3};
        int elemfound = singlenonduplicate(nums);
        System.out.println("The single non - duplicate eleem of this array is  " +  elemfound );
        
    }
    
}
