package striver.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndices {
   
    public List<Integer> targetIndices(int[] nums, int target) {
        return binarySearch(nums, target);       
    }
    public static List<Integer> binarySearch(int[] nums, int key){
        Arrays.sort(nums);
        List<Integer> res = new ArrayList();
        int low = 0;
        int high = nums.length - 1;
        int left = -1;
        while(low <= high){
            int mid =  (low + high) / 2;
            if(nums[mid] == key){
               left = mid; 
               high = mid - 1;
            }else if(nums[mid] > key)
              high = mid - 1;
            else if(nums[mid] < key)  
              low = mid + 1;
        }
        low = 0;
        high = nums.length - 1;
        int right = -1;
        while(low <= high){
            int mid =  (low + high) / 2;
            if(nums[mid] == key){
               right = mid; 
               low = mid + 1;
            }else if(nums[mid] > key)
              high = mid - 1;
            else if(nums[mid] < key)  
              low = mid + 1;
        }

        if(left == -1 && right == -1)
         return res;
        else
          while(left <= right){
            res.add(left);
            left++;
          } 
       // here we cant apply tht typical binary search if we do so tht will end up giving the solution thth will not work in all the test cases 
       // so for tht we applied binary search for two  times once for the left side tht will search for the 
       // target element in the left side and again for the right side and this will find the target element in the right side
       // and tht function will  give us the solution tht can be applied on all the test cases..

        return res;
    }
    public static void main(String[]args){
        int nums[] = {1 , 2 , 3 , 2  , 5,7};
        int target = 2;
        List<Integer> ans = binarySearch(nums, target);
        System.out.println("These are the indices " + ans +" of the array where the " + target + " element is found");
    }
}
    

