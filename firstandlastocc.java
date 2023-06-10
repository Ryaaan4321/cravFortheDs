package striver.binarysearch;

import java.util.Arrays;

public class firstandlastocc {
    public static int firstOcc(int arr[], int n, int x) {
        int first = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }
        return first;
    }

    public static int lastOcc(int arr[], int n, int x) {
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                last = i;
            }
        }
        return last;
    }
    public static int firstOcc1(int arr[], int n, int x) {
    int start = 0;
    int end = n - 1;
    int first = -1;

    while (start <= end) {
        int mid =  (start + end) / 2;

        if (arr[mid] >= x) {
            first = mid;
            end = mid - 1; 
             // Update 'end' here for first occurrence
        } else if (x < arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return first;
}

public static int lastOcc1(int arr[], int n, int x) {
    int start = 0;
    int end = n - 1;
    int last = -1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] > x) {
            last = mid;
            end = mid - 1;  // Update 'start' here for last occurrence
        } else if (x < arr[mid]) {
            start = mid + 1;
        } else {
            start = mid + 1;
        }
    }
    return last;
}


   

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 4, 5, 6, 9 };
        int n = arr.length;
        int x = 9;
        int ans[] = { firstOcc1(arr, n, x)  , lastOcc1(arr, n, x)};
        System.out.println("The first and last occurrence of the element are: " + Arrays.toString(ans));
    }
}
