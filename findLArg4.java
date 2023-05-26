package aryanhere.Striver;

public class findLArg4 {
    static void getElements(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Invalid input");
            return;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > large) {
                second_largest = large;
                large = arr[i];
            } else if (arr[i] > second_largest && arr[i] != large) {
                second_largest = arr[i];
            }
        }
        System.out.println("Second Smallest Element is " + second_small);
        System.out.println("Second Largest Element is " + second_largest);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 6 };
        int n = arr.length;
        getElements(arr, n);
    }
}
