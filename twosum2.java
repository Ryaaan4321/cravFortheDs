package aryanhere.Striver;
import java.util.Arrays;

public class twosum2 {
    public static int[] twoSum(int n,int []arr, int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
           

        }
        return ans;
    }
    public static void main(String[]args){
        int n = 6;
        int[]arr= {5,6,7,2,9,10};
        int target = 11;
        int [] ans =  twoSum(n,arr, target);
        System.out.println("The ans is " + Arrays.toString(ans));

    }
    
}
