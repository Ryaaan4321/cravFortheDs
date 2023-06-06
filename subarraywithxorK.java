package aryanhere.Striver;

import java.util.HashMap;
import java.util.Map;

public class subarraywithxorK {
    public static int subarraywithXorrk(int []arr, int d){
        int n = arr.length;
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                
                int xorr = 0;

                for(int k = i ; k < j; k++){
                    xorr = xorr ^ arr[k];

                }
                if(xorr == d) count++;

            }
        }
        return count;
    }


    public static int subarraywithxorK1(int[] arr , int d){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            int xorr = 0;
             for(int j = i; j < n ; j++){
                xorr = xorr ^ arr[j];
             }
             if(xorr == d) count++;
        }
        return count;
    }

    
    public static int subarraywithxorK2(int arr[] , int d){
        int n = arr.length;
        int xr = 0;
         HashMap<Integer , Integer > map = new HashMap<>(n);
         map.put(xr,1);
         int count = 0;
         for(int i = 0 ; i < n; i++){
            xr = xr ^ arr[i];

            int x = xr ^ d;
            
            if(map.containsKey(x)){
                count += map.get(x);
            }

            if(map.containsKey(xr)){
                map.put(xr,map.get(xr) + 1);
            }else{
                map.put(xr,1);
            }
         }
         return count;
    }

    public static void main(String[]args){
        int arr[] = {4 ,5 ,6 , 2 , 2 , 4};
        int d = 2;
        int ans = subarraywithXorrk(arr, d);
        System.out.println("THe Subarray with xorr k = " + ans);
    }
    
    
    
}
