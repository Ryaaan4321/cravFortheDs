package striver.binarysearch;

public class peakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] > arr[mid - 1]) {
                    low = mid + 1;

                } else {
                    high = mid - 1;

                }
            } else if (mid == 0) {
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (mid == n - 1) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;

    }
    // approach is same bt just it reduces the code length..

    public static int peakIndexInMountainArray1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 6, 2 };
        int ans = peakIndexInMountainArray1(arr);
        System.out.println("the peak index of the arrray is : " + ans);
    }

}
