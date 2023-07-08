package striver.Backtracking;
import java.util.*;
//  Before scrolling down in this solution u must ensure tht u  do have a bassic understanding of the recursion and how the backtracking workss
// if u dont have i  would say u go watch the leacture of recursion/ Backtracking or scroll the memes in innstagram kam se kam hasi to ayegi😊

public class combination {
    public static void findCombination(int idx, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
        // so this is the base case of this problem if the idx is at the last positon then return ar the value of the target becomes 0 then also return 
        // value of the target becomes 0 beacause of the calls of the recursion and the backtracking..
        
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // and if the value of the idx is less than the target then add it into the the helper array here i used (ds Arraylist)
        if (arr[idx] <= target) {
            ds.add(arr[idx]); // adding the value of the idx in the arraylist
            findCombination(idx, arr, target - arr[idx], ds, ans); //taking the idx value , arr and subtracting the value of the target with the value of the idx 
            ds.remove(ds.size() - 1); // and if the combination doesnt occurs or if combination occurs in the call in both the cases terminating that calls to avoid the 
            // run the program in the other callls
        }
        findCombination(idx + 1, arr, target, ds, ans);
         // if the previous call is terminated then checking for the combination in the next idx ..
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // caaliin tht function into this function..
        findCombination(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[]args){
        int nums[] = { 2 , 2, 4 , 8};
        int target = 8;
        List<List<Integer>> aaa = combinationSum(nums, target);
        System.out.println("THe combination where the element is found are : ");
        for(int i = 0 ; i < aaa.size(); i++){
            System.out.println(aaa.get(i) + " ");
        }
    }
}

