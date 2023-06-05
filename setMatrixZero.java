package aryanhere.Striver;

import java.util.*;

public class setMatrixZero {
    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markColumn(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        ArrayList<Integer> rowsToZero = new ArrayList<>();
        ArrayList<Integer> colsToZero = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    rowsToZero.add(i);
                    colsToZero.add(j);
                }
            }
        }

        for (int i = 0; i < rowsToZero.size(); i++) {
            markRow(matrix, n, m, rowsToZero.get(i));
        }

        for (int j = 0; j < colsToZero.size(); j++) {
            markColumn(matrix, n, m, colsToZero.get(j));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
// this question needs a revisionn.!
