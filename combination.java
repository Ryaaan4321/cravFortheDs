package striver.Backtracking;
import java.util.*;

public class combination {
    public static void findCombination(int idx, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombination(idx, arr, target - arr[idx], ds, ans);
            ds.remove(ds.size() - 1);
        }
        findCombination(idx + 1, arr, target, ds, ans);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
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

