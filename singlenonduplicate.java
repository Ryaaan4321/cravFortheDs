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
     public static void main(String[]args){
        int nums[] = {4 , 4 , 6   , 6 , 1 , 1 , 3};
        int elemfound = singlenonduplicate(nums);
        System.out.println("The single non - duplicate eleem of this array is  " +  elemfound );
        
    }
    
}
