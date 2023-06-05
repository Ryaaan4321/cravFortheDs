package aryanhere.Striver;

public class sor012 {
    public static int sort(int[] arr, int n){
        
        // initalize three pointers with 0

       int  count0 = 0, count1 = 0 ,count2 = 0;

       for(int i = 0;i < n ; i++){
        if(arr[i] == 0) count0++;
        if(arr[i] == 1) count1++;
        if(arr[i] == 2) count2++;

        // int sum1 = count0 + count1;


        } 
        // if it is 0 then putting it into the arr from 0 to number of count; 
        for(int i = 0; i < count0; i++){
            arr[i] = 0;
        }
        //  if it is 1 then putting it into the arr from the coun0 to the numbers of 1s we have
        for(int i = count0; i < count0 + count1; i++){
            arr[i] = 1;

        }
        // same goes for this ..!
        for(int i = count0 + count1; i < n; i++){
            arr[i] = 2;
        }
        //  nobody gives a fuck about u bitcch ..!
        return -1;

        // so as we are using something around two loops one for searching the element and other loops for 
        // storing the element then it will end up giving us something around O(2n) complexity
        // 
    }
    public static int sort1(int[] arr, int n){
        int low = 0, mid = 0, high = 0;

        // so this is basically the dutch flag algorithm where we are using three 
        // pointers and rest of the scene u can easily understand hahhahah...!

        while(mid <= high){

            //  so if mid === 0 then we are swappping it with low.. to make the 0s in  the
            // extreme from  ( 0 to left-1 );
            if(arr[mid] == 0){
                 
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

                //  and from low + 1 to mid - 1  ye ilaaka 1 k hai... 

            }else if(arr[mid] == 1){
                mid++;


        //    and mid + 1 se leke high tk sb bigda hua haii  whi sudharna hai
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                mid++;
                high--;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int n = 7;
        int arr[] = {0 , 2 , 1 , 2 , 1 , 0 , 1 , 0};
        sort(arr, n);
        System.out.println("Array after sorting");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sort1(arr, n);
        System.out.println("Array after sorting");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}

