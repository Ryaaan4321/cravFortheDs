package aryanhere.Striver;

public class maxSubArrray {
    public static int maxsubArrayy(int arr[] , int n){
        int maxiii = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 1; j < n; j++){
                for(int  k = i; k < j; k++){
                    sum += arr[k];
                    
                }
                maxiii = Math.max(maxiii, sum);


            }
        }
        return maxiii;
    }
    // using three loops so even a person who doesnt have a vison can tell us tht it will end up taking
    // O(N^3) time complexity  so what yes sir yes sir we are going to optimize it
   
    public static int maxsubArrayy1(int arr[], int n){
        int maxi = Integer.MIN_VALUE; 
//  storing the min value in the maxii and then iterating over the array 
// to get the maximum subarray in th array
        for(int i = 0; i < n; i++){
            int sum = 0;
            for( int j = i; j < n; j++){
                sum += arr[j];
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
        //  not too much better bt still better thn the last one algorithm O(N^2)..! 
    }



    // KADANES ALGORITHM...!


    public static int maxsubArrayy2(int arr[], int n) {
        // maxsum with integer.min_value to deal with the negative values and currsum with 0; 
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
    
        for (int i = 0; i < n; i++) {
            currSum += arr[i]; // checkking tand updating the maxsum with currsum 
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            // if the sum is < 0 thn discarding the sum bcs it willl end up giving -ve values
            if (currSum < 0) {   
                currSum = 0;
            }
        }
        
        return maxSum;
    }
    

    
    public static void main(String[]args){
        int n = 8;
        int arr[] = {-1,-2,-3,-5,-1,-7,-4,-1};
        System.out.println("the ans is = " + maxsubArrayy2(arr, n));
    }
    
}
