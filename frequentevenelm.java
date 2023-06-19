package project190;

import java.util.HashMap;
import java.util.Map;

public class frequentevenelm {
     public static int mostfrequenteven(int[] nums) {
        
        Map<Integer,Integer> mapp = new HashMap<>();
        
        int maxelm = -1;
        int result = Integer.MAX_VALUE;
        
        for(int i:nums){
            
           
            if(i%2 == 0){  // storing the element if it is even
            mapp.put(i,mapp.getOrDefault(i,0)+1);
            
            
            if(mapp.get(i)>maxelm){  // checking if ttht elm is greater thn other elements
            maxelm = Math.max(maxelm,mapp.get(i));
            result=i;
            }                                   
            else if(mapp.get(i) == maxelm && result > i){  //Checking to the elemnet if  it is equals to Max Val and element is less than current res
            result = i;
            }
            }
        }
        
        return result==Integer.MAX_VALUE? -1: result; 
        
    }
    public static void main(String[]args){
        int nums[] = { 2 , 2 , 2 , 4 ,4  ,4  ,4, 1};
        int ans = mostfrequenteven(nums);
        System.out.print("The most frequent even element in this array is = " + ans);
    }
    
}
