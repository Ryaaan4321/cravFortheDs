package aryanhere.Striver;
import java.util.*;
import java.util.Arrays;

public class rotateImage {
    static int[][] rotate(int[][] matrix1) {
        int n = matrix1.length;
    
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix1[i][j];
            }
        }
        return rotated;
    }
    
    public static void main(String[] args) {  
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        
        System.out.println("Original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int rotated[][] = rotate(arr);
        System.out.println("Rotated matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }




    static void rotate1(int[][] matrix){
        int n = matrix.length;

        // finding the transpose of this matrix in this code snipppet...!

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reversing the column to make it look like a 90' rotated matrix ...!
        int ind = n - 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n/2 ; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[ind][i];
                matrix[ind][i] = temp;
                ind--;
            }
            ind = n - 1;
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n ;  j++){
                System.out.print(matrix[i][j]  + " ");
            }
            System.out.println();
        }
    }
   
}
