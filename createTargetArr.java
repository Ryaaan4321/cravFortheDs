package striver.striver;
// 1389. Create Target Array in the Given Order


public class createTargetArr {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < index.length - 1;j++){
                if(nums[i] == index[j] && ans[i] != nums[i]){
                    ans[i] = index[j];
                }else if(nums[i] > index[j]  && ans[i] != nums[i]){
                    ans[i] = nums[i];
                }else  ans[i] = index[j];
                
            }
        }
        return ans;
        
    }
    public static void main(String[]args){
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};

        int anss[] = createTargetArray(nums, index);
         

        for(int i = 0; i < anss.length-1; i++){
            System.out.println(anss[i] + " ");
        }
    }
}
    

