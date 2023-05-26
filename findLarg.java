package aryanhere.Striver;
import java.util.*;

public class findLarg {
    public static void main(String[]args){
        int []arr1 = {3,5,6,7,4,9};
        System.out.println("The Largest Element is " +sort(arr1));

        int []arr2 = {4,7,8,0,2,10};
        System.out.println("The Largest Element is "+sort(arr2));
    }
    
    static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
