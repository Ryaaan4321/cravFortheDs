package aryanhere.Striver;

import java.util.Arrays;
import java.util.HashSet;

public class longestCOnsecutive {
    
   public static int longestConsecutive1(int[] nums) {
       HashSet<Integer> hashSet = new HashSet<>();
       for (int num : nums) {
         hashSet.add(num);
       }
    
    int longestStreak = 0;
    
    for (int num : nums) {
        if (!hashSet.contains(num - 1)) {
            int currentNum = num;
            int currentStreak = 1;
            
            while (!hashSet.contains(currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }
            
            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }
    
    return longestStreak;
}

   
    public static int longestConsecutiv(int[]nums){
        if(nums.length == 0 || nums == null){
            return 0 ;

        }
        Arrays.sort(nums);

        int ans = 1;
        int prev = nums[0];
        int curr = 1;
        // smjh mein to aagya kya ho rha par mene question ni pdha tha dhng se to confusion ho rha hai.. hahahah..!
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == prev + 1){
                curr++;
            }else if(nums[i] != prev){
                curr = 1;

            }
            prev = nums[i];
            curr = Math.max(ans, curr);
        }
        return ans;

    }
    public static void main(String[]args){
        int arr[] = {100, 200 , 1, 2, 3, 4};
        int ans = longestConsecutive1(arr);
        System.out.println("The longest consecutive is  " + ans);
    }
    //pendingggg
    
    
}
