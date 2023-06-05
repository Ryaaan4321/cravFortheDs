package aryanhere.Striver;
import java.util.*;

public class rearrangeelmBySign {

    // and this code is only for the condition tht arr of n size is given nd there are eqyal no of pos nd neg nu
    // numbers are given
    public static int[] reArangebySign(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
    
        // traversing the arr
         for (int i = 0; i < n; i++) { 
            if (arr[i] > 0) { // one looop
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
    
        int maxLength = Math.max(pos.size(), neg.size());
    
        for (int i = 0; i < maxLength; i++) { // n/2 loops 
            if (i < pos.size()) {
                arr[2 * i] = pos.get(i);
            }
            if (i < neg.size()) {
                arr[2 * i + 1] = neg.get(i);
            }
        }
    
        return arr;// so( O(N+N/2)) tc
    }
    public static ArrayList<Integer> reArangebysign2(ArrayList<Integer> arr){
        int n = arr.size();

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        int posIndex = 1 , negIndex = 0;

        for( int i = 0 ; i < n ; i++){ // so one loop bitches its O(N) and 
            //(O(N) space complexity bcs we are using arraylist to store the ans)

            if(arr.get(i) > 0){
                ans.set(negIndex, arr.get(i));
                negIndex +=2;
            }else{
                ans.set(posIndex, arr.get(i));
                posIndex += 2;
            }
        }
        return ans;

    }

    // There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). 
    // Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. The leftover elements should be placed at the very end in the same order as in array A.
    // Note: Start the array with positive elements.

    public static ArrayList<Integer> reArrangeBySign3(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
    
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }
    
        if (pos.size() < neg.size()) {  // if negative elements are >  positive elementts 
            for (int i = 0; i < pos.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
    
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(index, neg.get(i));
                index++;
            }
        } else {       //if positive   elments are  > neg elements 
            for (int i = 0; i < neg.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
    
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(index, pos.get(i));
                index++;
            }
        }
    
        return arr;
    }
    
    
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,-6,-5,-4));

        ArrayList<Integer> ans = reArrangeBySign3(arr);

        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print(ans.get(i) + "  ");
        }


        // int n = 6;
        // int arr[] = {1, -2, -3, -1, 4, 2, };
        // int ans[] = reArangebySign(arr, n);
        // System.out.print("the ans is: ");
        // for (int i = 0; i < ans.length; i++) {
        //     System.out.print(ans[i] + " ");
        // }
    }
}
