package striver.binarysearch;

// SQUARED OF SORTED ARRAY 977

//Given an sorted array return the arrays squares of each element in sorted non - decreasing order
public class squaresofsortedarr {
   public static int[] squaredArr(int nums[]){
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {
            int lSquare = nums[left] * nums[left];
            int rSquare = nums[right] * nums[right];

            if (lSquare > rSquare) {
                ans[k] = lSquare;
                left++;
            } else {
                ans[k] = rSquare;
                right--;
            }

            k--;
        }

        return ans;
    

   }
   // THe intiution behind this question is preety straight forward  as in the problem its given tht array is 
   // sorted so binary search simple shit simple logic bt the condition is to return the array in non decreasing order
   // and for tht we used a one anothr pointer k to traverse in the ans array if the rightSQelm is greater thn the
   // thr leftsqelm then we put the leftsqelm thts ittt.. 
   // left ++ , right -- , k-- (bcs its n -1 initially);
   public static void main(String[]args){
    int nums[] = { 1 , 2, 3 ,4};
    int sq[] = squaredArr(nums);
    System.out.print("The squared array  of this array is = ");
    for(int i = 0 ; i < sq.length; i++){
        System.out.print(sq[i] + " ");
    }

   }
}


    

