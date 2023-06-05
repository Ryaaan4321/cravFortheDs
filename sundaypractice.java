package aryanhere.Striver;

import java.util.ArrayList;
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

    
    public static void main(String[] args) {

        int n = 5 , m = 5;
        int arr[] = {1 , 7, 5 ,2 ,2};
        int arr1[] = {2 , 3, 5, 6, 4 };

        ArrayList<Integer> union = findunion(arr, arr1, n, m);
        System.out.println("union is ..  ");
         for(int it: union){
            System.out.print(it + " ");
         }
  } 
}   