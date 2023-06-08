package striver.binarysearch;

public class binaryintro {
    public static int binarysearch1(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;  // Element not found
        }
        
        int mid = low + (high - low) / 2;  // Avoids integer overflow
        
        if (target == arr[mid]) {
            return mid;  // Element found at the middle of the index
        } else if (target < arr[mid]) {
            return binarysearch1(arr, low, mid - 1, target);  // Search the left half of the array
        } else {
            return binarysearch1(arr, mid + 1, high, target);  // Search the right half of the array
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 13, 14, 17};
        int target = 14;
        int result = binarySearch(arr, target);
        
        if (result == -1) {
            System.out.println("The element was not found.");
        } else {
            System.out.println("Element " + target + " found at index " + result);
        }
    }
    
    
    public static int binarySearch(int arr[], int k) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int loc = -1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (arr[mid] < k) {
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                loc = mid;
                break;
            }
        }
    
        return loc;
    }
    


    
   
}
    
