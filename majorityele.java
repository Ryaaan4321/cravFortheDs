package aryanhere.Striver;

public class majorityele {
    public static int  majortiyelm(int arr[] , int n ){
        //  so this is the brute force approch where we can simply see tht it is taking O(n^2)
        //  time complexity and O(1) space  complexity..!

        for(int i = 0; i < n ; i++){

            int count = 0;

            for(int j = 0; j < n; j++){
            if(arr[i] == arr[j]){
                count++;
            }

            if(count > n/2){
                return arr[i];
            }
           }

        }
        return -1;
     }
    
     public static int majorityele1(int arr[], int n){
        int cnt = 0, elm = 0;

        //  APPLYING MOORE VOOTING ALGORITHM

        for(int i = 0; i < n; i++){

            if(cnt == 0){
                elm = arr[i];
                cnt = 1;
             // if the elm is equal to the next element of the arr[i] then we are incementing the cnt..!
            
            }else if(arr[i] == elm){

                cnt++;

                // and if not thn decrementing it..!
            }else {

                cnt--;
            }

            // checking if the elem occcurs more  thn (n/2) times if it is thn returning tht element

            int cnt1 = 0;
            for(int z = 0 ; z < n; z++){
                if(arr[z] == elm){
                    cnt1++;

                }
                if(cnt1 > (n/2)){
                    return elm;
                }
            }
        }
        return -1;
        //  so int this program w are using two loops and only in the worst case the code will go upto n 
        // so it will take around O(2N) bt we can drop constant factor
       // so it will end up taking O(N) and O(1)  space complexity   
   }
    
    // We have one more approach of hashmap bt i  know  only some basic operation of
    //  so will update the code later..!

    public static void main(String[]args){
    int n = 7;
    int arr[] = {1,3,3,3,3,4,5};
    int ans = majorityele1(arr, n);
    System.out.println("this is the ans = " +ans);

    }
    
}
