package aryanhere.Striver;
import java.util.*;

public class findlarg3 {
    static void getElements(int[]arr, int n){
        if(n == 0 || n == 1){
            System.out.println(-1);
            System.out.println("");
            System.out.println(-1);
    

        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-1];

        System.out.println("The Largest Element is" + large);
        System.out.println("The Smallest Element is " + small);
      
    }
    public static void main(String[]args){
        int[]arr = {1,2,4,6,7,5};
        int n = arr.length;
        getElements(arr, n);
    }
}
