package aryanhere.Striver;
import java.util.*;

public class leaderinarray {
    public static ArrayList<Integer> printLeader1(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader == true)
                ans.add(arr[i]);
        }
        return ans;
    }
    //  as we r using two nested loops so in the worst case it will be O(n^2) simmple shit..!


    public static ArrayList<Integer> printLeader(int arr[] , int n){
        ArrayList<Integer> ans = new ArrayList<>(n);
        int max = arr[n-1];
        ans.add(arr[n-1]);

        for(int i = n-2 ; i >= 0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;

//  in this approach we stored the last value of the array in the max line - 27
//  aftter tht using a loop and traversing from the right side on the array if the curr elm is 
// greter thn the max updating  the max with tht element in line 33
//  time complexity = O(N)
//  space complexity = O(N)
    }
    public static void main(String[]args){
        int n = 6;
        int arr[] = {10,22,12, 3, 0,6};
        ArrayList<Integer> ans = printLeader(arr, n);
        for(int i = 0 ; i < ans.size();i++){
            System.out.print(ans.get(i) + " ");
        } 
    }

    
}
