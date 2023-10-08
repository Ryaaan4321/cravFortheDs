import java.util.*;

public class firstAndLastocc {
    public static int solve(int n, int x, int a[]) {
        int first = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                first = i;
                break;
            }
        }
        return first;
    }

    public static int solve1(int a[], int n, int x) {
        int last = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                last = x;
                break;
            }
        }
        return last;
    }

    public static int solve2(int a[], int x, int n) {
        int start = 0;
        int end = a.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == x) {
                first = a[mid];
                start = mid + 1;
            } else if (x < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }

    public static int firstOccurrence(int a[], int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == k) {
                first = mid;
                high = mid - 1;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int a[], int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == k) {
                last = mid;
                low = mid + 1;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int a[], int n, int k) {
        int first = firstOccurrence(a, n, k);
        if (first == -1)
            return new int[] { -1, -1 };
        int last = lastOccurrence(a, n, k);
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int n = arr.length;
        int k = 8;
        int[] ans = firstAndLastPosition(arr, n, k);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
