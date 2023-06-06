package aryanhere.Striver;

import java.util.ArrayList;
import java.util.Arrays;


public class threesome {
    static  ArrayList<ArrayList<Integer>> thresome(int nums[]){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(0);
        //declaring the arrayllistt...

        //Traversing witht the help of three loops and finding tht three elements...!
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1 ; j < nums.length; j++ ){
                for(int k = j + 1; k < nums.length; k++){
                    // declaring one more arraylist to store the three elem 
                    ArrayList<Integer> temp = new ArrayList<>();
                    if(nums[i] + nums[j] + nums[k] == 0){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                    }// pushing back the elements into ans arraylist..
                    if(temp.size() != 0){
                        ans.add(temp);
                    }

                 }
           }
       }
       return ans;
       // three loops so its obvious tht it will take around (O(N^3)) time complexity..!
       // space complexity u know thth....^_^
       // Lets optimize ittt..!
    
    }


    public static ArrayList<ArrayList<Integer>> threeSum(int[] arr) {
    Arrays.sort(arr);
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    for (int i = 0; i < arr.length ; i++) {
        if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
            int low = i + 1, high = arr.length - 1;
            int sum = -arr[i];

            while (low < high) {
                if (arr[low] + arr[high] == sum) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[low]);
                    temp.add(arr[high]);
                    res.add(temp);

                    while (low < high && arr[low] == arr[low + 1]) low++;
                    while (low < high && arr[high] == arr[high - 1]) high--;
                    low++;
                    high--;
                } else if (arr[low] + arr[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }

    return res;
}

   
    public static void main(String[]args){
        int arr[] = {-1 , 0 , 1 , 2 , -1 , -4 };
        ArrayList<ArrayList<Integer>> ans = thresome(arr);

        for(int i = 0 ; i < ans.size(); i++){
            for(int j = 0 ; j < ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
        }
        System.out.println();
    }
}
