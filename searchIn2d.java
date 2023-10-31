package striver.binarysearch;
// https://leetcode.com/problems/search-a-2d-matrix-ii/

public class searchIn2dMat {
    public static boolean searchIn2d(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static boolean binaryFunc(int[] matrix, int target) {
        int n = matrix.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[mid] == target)
                return true;
            else if (matrix[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static boolean searhin2d1(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;// no need of this just to waste the 3 seconds of the time

        for (int i = 0; i < n; i++) {
            boolean flag = binaryFunc(mat[i], target);
            if (flag == true)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 21;
        boolean ans = searhin2d1(mat, target);

        System.out.println("the element for this matrix is found to be  " + ans);
    }
}
