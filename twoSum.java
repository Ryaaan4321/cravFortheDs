package aryanhere.Striver;

import java.util.HashMap;

public class twoSum {
    public static String twSum(int[] arr, int target){
        HashMap<Integer, Integer> mpp = new HashMap<>(arr.length);
        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            int num2 = target-num;
            if(mpp.containsKey(num2)){
                return "yes";
            }
            mpp.put(num,i);
        }
        return "no";
    }
    public static void main(String[]args){
        int n = 6;
        int[] arr = {2,10,5,7,6,9};
        int target = 11;
        String ans = twSum(arr, target);
        System.out.println("ans is " + ans);

    }
}
