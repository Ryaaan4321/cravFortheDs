package aryanhere.Striver;

import java.util.HashMap;

public class numberofsubaarray {
    public static int subarraywithsumK(int arr[] , int d){
        int n = arr.length;
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int xorr = 0;

                for(int k = i ; k  < j; k++){
                    xorr = xorr ^ arr[k];
                }
                if(xorr == d) count++;
                
            }
        }
        return count++;

    }
    public static int subarraywithsumK2(int arr[] ,int d){
        int n = arr.length;
        int count = 0;
        //traversing into the array
        for(int i = 0 ; i < n; i++){
            int xorr = 0;

            // to avoid the extra complexity using only two loops..!
            for(int j = i ; j < n ; j++){
                xorr = xorr ^ arr[j];
            }
            if(xorr == d) count++;
       }
       return count;
    
   }
   public static int subarraywithsumK3(int arr[] , int d){
    int n = arr.length;
    int xr = 0;
    HashMap<Integer , Integer> map = new HashMap<>(n);
    map.put(xr, 1);
    int count = 0;
    for(int i = 0 ; i < n; i++){
        xr = xr ^ arr[i];
        int xor = xr ^ d;

        if(map.containsKey(xor)){
            count += map.get(xor);

        }
        if(map.containsKey(xr)){
            map.put(xr, map.get(xr) + 1);
        }else{
            map.put(xr , 1);
        }
    }
    return count;
   }
   public static void main(String[]args){
    int arr[] = { 4 , 5 , 6 , 2 , 3 , 2 , 1};
    int d = 4;
    int ans = subarraywithsumK3(arr, d);
    System.out.println(" the number of subarrays are " + ans); 
   }
}