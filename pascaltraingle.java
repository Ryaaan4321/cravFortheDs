package aryanhere.Striver;

import java.util.ArrayList;

// find the element at the (r,c) position..!
public class pascaltraingle {
    public static long combination(int n , int r){
        long res = 1;

        for(int i = 0 ; i < n; i++){
            res = res * (n - i);
            res = res/(i + 1);
        }
        return res;
    }

    public static int pascaltriangle(int r , int c){
        int element = (int)combination(c, r);
        return element;
    }

    // Given the row number n print the nth row of pascals trainagle..!
    public static void pascaltraingle2(int n){

        for(int c = 1 ; c <= n ; c++){
            System.out.println(combination(n -1, c - 1) + " ");
        }
        System.out.println();
    }  
    // optimal appproach to solve this problem.!
    public static void pascaltriangle3(int n){
        long ans = 1;
        System.out.println(ans + " ");

        for(int i = 1; i < n; i++){
            ans = ans * (n-1);
            ans = ans / i;
            System.out.println(ans + " ");
        }
    }
    // Given the number of rows n print the first  row of pascal traingle..!

    public static ArrayList<ArrayList<Integer>> pascaltriangle4(int n){
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>(n);
        for(int row = 1 ; row < n; row++){
            ArrayList<Integer> tempList = new ArrayList<>(n);
            for(int col = 1 ; col <= row; col++){
               tempList.add(row-1, col-1);

            }
            ans.add(tempList);
        }
        return ans;
    }

    // one more approach to print the the first row of pascal triagle..!
    public static ArrayList<Integer> buildrows(int row){
        long ans = 1;
        ArrayList<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);

        for(int col = 1 ; col < row; col++){
            ans = ans * (row - col);
            ans = ans/col;
            ansrow.add((int)ans);
        }
        return ansrow;
    }
    public static ArrayList<ArrayList<Integer>> pascaltriangle5(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(n);
        for(int row = 1; row <= n ; row++){
            ans.add(buildrows(row));
        }
        return ans;
    }

    public static void main(String[]args){
        int r = 5 ;
        int c = 3;
        int element = pascaltriangle(r, c);
        System.out.println("the element at the positon (r,c) is " + element);

        //to print he first n rows of the pascal triangle..
        int n = 5;
        ArrayList<ArrayList<Integer>> ans = pascaltriangle5(n);
        for(ArrayList<Integer> it : ans){
           for(int ele : it){
                System.out.println(ele + " ");
            }
        }
        System.out.println();

    }
    
}
