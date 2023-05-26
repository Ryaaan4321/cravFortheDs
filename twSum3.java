package aryanhere.Striver;
import java.util.*;

public class twSum3 {
    public static boolean twoSum(int n, int []arr,int target){
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                return true;
            }else if(sum<target) left++;
            else right--;
        }
        return false;

    }
    public static void main(String[]args){
        int n = 6;
        int[]arr = {4,5,6,7,9,10};
        int target = 11;
        boolean  ans = twoSum(n, arr, target);
        System.out.println("THe ans is " + ans);
    }
    
}
