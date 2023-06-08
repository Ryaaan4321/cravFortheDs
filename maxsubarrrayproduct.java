package striver.striver;

import java.util.*;
public class maxsubarrrayproduct{

	static int maxProductSubArray(int arr[]) {
	    int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	            result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;     
	}
	static int maxProductSubArray1(int arr[]){

		int n = arr.length;
		int result = Integer.MIN_VALUE ;
		for ( int i = 0 ; i < arr.length-1 ; i++)
			for(int j = i + 1; j < arr.length ; j++){
				int prod = 1;
				for(int  k = i ; k <= j; k++)
					prod *= arr[k];
					result = Math.max(result , prod);
				
			}
		
		return result;
	}

	static int maxProductSubArray2(int arr[]) {
		int maxleft = 0;
		int maxright = 0;
		boolean zeropresent = false;
		int prod = 1;
	
		for (int i : arr) {
			if (i == 0) {
				zeropresent = true;
				prod = 1;
				continue;
			}
			prod *= i;
			maxleft = Math.max(maxleft, prod);
		}
	
		prod = 1;
	
		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j] == 0) {
				zeropresent = true;
				prod = 1;
				continue;
			}
			prod *= arr[j];
			maxright = Math.max(maxright, prod);
		}
	
		if (zeropresent) {
			return Math.max(maxleft, maxright);
		}
		return Math.max(maxleft, maxright);
	}
	
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray2(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}
    

