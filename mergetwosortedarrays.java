package project190;

import java.util.Arrays;

public class mergetwosortedarrays {
    public static int[] merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int arr1Point = 0; // this will help us traverse the 1st array
        int arr2Point = 0; // this will help us traverse the 2nd array
        int arr3Point = 0; // this pointer will help us traverse the third array
        int arr3[] = new int[n + m]; // to store all the elements of both arrays

        while (arr1Point < n && arr2Point < m) {
            if (arr1[arr1Point] <= arr2[arr2Point]) {
                arr3[arr3Point] = arr1[arr1Point];
                arr1Point++;
            } else {
                arr3[arr3Point] = arr2[arr2Point];
                arr2Point++;
            }
            arr3Point++;
        }

        while (arr1Point < n) { // if the elemnts left in the ist array
            arr3[arr3Point] = arr1[arr1Point];
            arr1Point++;
            arr3Point++;
        }

        while (arr2Point < m) {// if the elements left behind in the 2nd array
            arr3[arr3Point] = arr2[arr2Point];
            arr2Point++;
            arr3Point++;
        }

        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4 , 5};
        int[] arr2 = {2, 4, 6};
        int[] mergedArray = merge(arr1, arr2);

        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }



}