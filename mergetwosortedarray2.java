package striver.striver;
 import java.util.Arrays;
 public class mergetwosortedarray2 {


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4 ,4, 5};
        int[] arr2 = {2, 4,  5 ,6};
        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];
        int left = n - 1;
        int right = m - 1;
        int index = mergedArray.length - 1;

        while (left >= 0 && right >= 0) {
            if (arr1[left] > arr2[right]) {
                mergedArray[index] = arr1[left];
                left--;
            } else {
                mergedArray[index] = arr2[right];
                right--;
            }
            index--;
        }

        while (left >= 0) {
            mergedArray[index] = arr1[left];
            left--;
            index--;
        }

        while (right >= 0) {
            mergedArray[index] = arr2[right];
            right--;
            index--;
        }

        return mergedArray;
    }
}

    

