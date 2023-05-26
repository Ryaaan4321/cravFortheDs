package aryanhere.Striver;


public class findMIssingNumber {
    public static int missingNumber4(int arr[], int n){
        int xor1 = 0, xor2 = 0;

        for(int i = 0; i< n-1; i++){
            xor2 = xor1^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;
        
        return(xor1^xor2);
    }

     public static int missingNumber3(int arr[], int n){
         int sum =(n*(n+1)/2);
         int s2 = 0;
         for(int i = 0; i< n-1; i++){
            s2 += arr[i];

        }
        int missingnumberr = sum -s2;
        return missingnumberr;
      }
      
   
        public static int missingNumber2(int arr[], int n) {
            int hash[] = new int[n + 1];
            for (int i = 0; i < n - 1; i++) {
                hash[arr[i]]++;
            }
    
            for (int i = 1; i <= n; i++) {
                if (hash[i] == 0) {
                    return i;
                }
            }
            return -1;
        }
    
    
    public static int missingNumber1(int arr[] , int n){
        for(int i = 1 ; i <= n; i++){
            int flag = 0;
            for(int j = 1; j < n-1 ; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
                
            }if(flag == 0){
                return i;
            } 

            
        }
        return -1;
    }
    
    public static void main(String[]args){
        int n = 5;
        int arr[] = {5,2,3,4};
        int ans = missingNumber4(arr,n);
        System.out.println("THe ans is " + ans);
    }
}


