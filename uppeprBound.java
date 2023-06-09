package striver.binarysearch;

public class uppeprBound {
    public static int upperBound(int arr[], int target, int n) {
        int low = 0, high = n - 1; // init
        int idx = n; 

        while (low <= high) { // the condition for the upper bound
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                idx = mid;
                high = mid - 1; // if it is then inializing the mid value to this..
            } else {
                low = mid + 1;
            }
        }

        return idx;
    }

    public static int recupperbound(int arr[], int low, int high, int target) {
    // base condition
    if (low > high) return -1;

    // mid
    int mid = low + (high - low) / 2;

    if (target < arr[mid]) {
        return recupperbound(arr, low, mid - 1, target);
    } else if (target > arr[mid]) {
        return recupperbound(arr, mid + 1, high, target);
    } else {
        // Ch
        if (mid == 0 || arr[mid - 1] < target) {
            return mid;
        } else {
            return recupperbound(arr, low, mid - 1, target);
        }
    }
}
// this method will help us to return the lower bound..!

public static int recupper(int arr[], int target) {
    int low = 0, high = arr.length - 1;
    return recupperbound(arr, low, high, target);
}


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 6, 7};
        int target = 0;
        int ans = recupper(arr, target); // calling the functionnn..!
        System.out.print("The element " + target + " found at index = ");
        System.out.println(ans);
    }
}
