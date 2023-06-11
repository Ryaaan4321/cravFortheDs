package striver.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class sundaypractice {
    public static boolean issorted(int arr[] , int n){
        for(int  i = 0 ; i < n ; i++){
            for( int j = i+1 ; j < n ; j++){
                if ( arr[j] > arr[i]){
                    return true;

                }
            }
        }
        return false;
    }
    public static boolean issoreted1( int arr[] , int n){
        for(int i = 0 ; i < n; i++){
            if( arr[i] > arr[i+1]){
                return false;
            }
           
        }
        return true;
        //  time complexity (O(N))
    }
    public static int removedupliacate(int arr[] , int n){
        HashSet<Integer> set = new HashSet<>(n);
        for(int i  = 0 ; i < n ; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set){
            arr[j++] = x;

        }
        return k;
    }
    public static int removedupliacate1(int arr[] , int n ){
        int i = 0 ; 
        for(int j = 1 ; j < n ; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i++] = arr[j];
            }
        }
        return i;
    }
    public static void leftrotate(int arr[] , int n ){
        int temp[]  = new int[n];
        temp[n-1] = arr[0];

        for(int i = 1 ; i < n ; i++){
            temp[i-1] = arr[i];

        }
        for(int i = 0 ; i< n ; i++){
            System.out.print(temp[i] + " ");
        }

    } 
    public static void leftRotate(int arr[], int n, int d) {
        if (n == 0)
            return;
        d = d % n;
    
        if (d == 0)
            return;
    
        int[] temp = new int[d];
    
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }

   static void reverse(int start , int end , int arr[]){

    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

    }
    
   }
   static void leftrotate1(int arr[] , int n , int d){
    if(n == 0) return;
    d = d % n;

    reverse(0, d-1, arr);
    reverse(d, n-1, arr);
    reverse(0, n-1, arr);

   }

   static void swap(int arr[] , int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

   }
   static void moveZerostoend(int arr[] ){
    int n = arr.length;
    for(int i = 0 ; i < n ;i++){
        if(arr[i] != 0){
            continue;
        }else{
            int j = i;
            while(j < n-1 && arr[j] == 0){
                j++;
            }
            swap(arr, i, j);
        }
    }
   }
   static ArrayList<Integer> findunion(int arr[] , int arr1[] , int n , int m){
    HashSet<Integer> s = new HashSet<>(n, m);
    ArrayList<Integer> union = new ArrayList<>(n);

    for(int i = 0 ; i < m ; i++){
        s.add(arr[i]);
    }
    for(int i = 0 ; i < n ; i++){
        s.add(arr1[i]);
    }
    for(int it: s){
        union.add(it);
    }
    return union;
   }
   
    
    public static ArrayList<Integer> intersection(int X[], int Y[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                i++;
            } else if (X[i] > Y[j]) {
                j++;
            } else {
                ans.add(X[i]);
                i++;
                j++;
            }
        }
        return ans;
    }public static int findmising(int arr[] , int n){
        int sum = (n * (n + 1)/2);
        int sum2 = 0;
        for(int i = 0 ; i < n ; i++){
            sum2 += arr[i];
        }
        int missingnum = sum - sum2;
        return missingnum;
    }
    public static int longestsubarrray(int arr[] , int x){
        int n = arr.length;
        int len = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = i + 1 ; i < n ; i++){
                int sum = 0;
                for(int k = i ; k < j; k++){
                     sum += arr[k];

                }
                if(sum == x) {
                    len = Math.max(len, j - i + 1);
                    
                }

            }
        }
        return len;
    }
    public static int LongestSubarray1(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
    public static void sort012(ArrayList<Integer> arr , int n){
        
        int count0 = 0, count1 = 0 , count2 = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr.get(i) == 0) count0++;
            else if(arr.get(i) == 1)count1++;
            else count2++;
        }
        for(int i = 0 ; i < count0; i++){
            arr.set(i, 0);
        }
        for(int i = count0 ; i < count1; i++){
            arr.set(i, 1);

        }
        for(int i = count0 + count1 ; i < n; i++){
            arr.set(i, 2);
        }
    }
    public static void sortzeone2(ArrayList<Integer> arr , int n){
        int low = 0 , mid = 0 , high = n - 1;
        while(mid <= high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1){
                mid++;
            }
            else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
    public static int majorityelm(int arr[] ){
        int n = arr.length;
        for(int i =  0 ; i < n ; i++){
            int cnt = 0 ;
            for(int j = 0; j < n; j++){
                if(arr[j] == arr[i]){
                    cnt++;
                }
              
               
            }
            if(cnt > n /2) return arr[i];
           
        }
        return -1;
    }
    public static int majroityelm1(int arr[]){
        int n = arr.length;
        int cnt = 0;
        int elm = 0;
        for(int i = 0 ; i < n; i++){
            if(cnt == 0){
                cnt = 1;
                elm = arr[i];
            }else if(elm == arr[i]){
                cnt++;
            }else cnt--;

         }
         int cnt1 = 0;
         for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == elm){
                cnt1++;
            }
            if(cnt1 > n/2) return elm;

         }
         return -1;
       
        
       
    }

      public static void main(String args[]) {
        int arr[] = {0, 2, 1, 2, 2, 2};
        int ans = majroityelm1(arr);
        System.out.println("The majority elm = " + ans);

       
    }


}