package aryanhere.Striver;

import java.util.*;

public class foursum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        // declaring the hashset and arraylist to store the values and ans
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            // if it is equal to sum then stroing the values in the temporary arraylist..!
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }// runnig four looops so its near about (O(N^4))
        // so obviously the interviwer will not be happy with this complexity so he will ask u to 
        // optimize itt... so Let,s optimize it

        ans.addAll(set); // Add elements from HashSet to the final result

        return ans;
    }

    public static ArrayList<ArrayList<Integer>> foursum1(int nums[] , int target){

        int n = nums.length;
        // so in this approach what we did is  to use my ally hashset to store the values it it contains the fourth  
        // values then it will return it..!

        HashSet<ArrayList<Integer>> set = new HashSet<>(n);

        for(int i = 0 ; i < n ;  i++){
            for(int j = i + 1; j < n ; j++){

                // long because there are a chances of getting the large valuess..!
                HashSet<Long> hashSet = new HashSet<>(i);
                for(int k = j + 1 ; k < n ; k++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    
                    // if it contains then storing the values into this temporary arraylist...
                    if(hashSet.contains(fourth)){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)fourth);
                        
                        //sorting them up...!
                        temp.sort(Integer :: compareTo);
                        set.add(temp);

                    }
                    hashSet.add((long)nums[k]);

                }
            }
        }
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>(set);
       return ans;
       //  Time Complexity: O(N3*log(M)), where N = size of the array, M = no. of elements in the set.
    //  Reason: Here, we are mainly using 3 nested loops, and inside the loops there are
    //  some operations on the set data structure which take log(M) time complexity.

    //  Space Complexity: O(2 * no. of the quadruplets)+O(N)
    //  Reason: we are using a set data structure and a list to store the quads. This results in the first term.
    //  And the second space is taken by the set data structure we are using to store the array elements. 
    //  At most, the set can contain approximately all the array elements and so the space complexity is O(N).
   
    // so intterviwer will say yeaa ok can u optimize it so u will say yeaa we will do it..!
    }
    public static ArrayList<ArrayList<Integer>> foursum3(int nums[] , int target){
        int n = nums.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(n);
        Arrays.sort(nums);

        for(int i = 0; i < n ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < n; j++){
                if( j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;
                //in this we are taking k and l as a pointers to move ...

                while(k < l ){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum == target){
                       // if it is equal to sum then stroing it into the temporay arraylist..
                       // if u didnt get it then watch the videos of it in the strivers A2z dsa course
                       // thts worlds in depth dsa course when we talk about dsa algo why do we say tht 
                       // because these course involve 450+ problems by the end of the course u would have solved more 
                       // than 400+ problems one thing we can assure once u complete this course u will be able to crack
                       // any of the company in any part of the worldd..!
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);

                        k++;
                        l--;

                        while( k < l && nums[k] == nums[k - 1]) k++;
                        while( k < l && nums[l] == nums[l + 1]) l--;
                    }else if( sum < target) k++;

                    else l--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 1, 1};
        int target = 9;
        ArrayList<ArrayList<Integer>> ans = foursum3(nums, target);

        System.out.println("The four elements are:");
        for (ArrayList<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
