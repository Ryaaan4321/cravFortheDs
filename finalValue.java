package striver.striver;

// 2011. Final Value of Variable After Performing Operations

// There is a programming language with only four operations and one variable X:

// ++X and X++ increments the value of the variable X by 1.
// --X and X-- decrements the value of the variable X by 1.
// Initially, the value of X is 0.

// Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

// Example 1:

// Input: operations = ["--X","X++","X++"]
// Output: 1
// Explanation: The operations are performed as follows:
// Initially, X = 0.
// --X: X is decremented by 1, X =  0 - 1 = -1.
// X++: X is incremented by 1, X = -1 + 1 =  0.
// X++: X is incremented by 1, X =  0 + 1 =  1.

public class finalValue {
    // so the question itslef is saying  evrything about it solutionnn..!  
    // initially the no is = 0;
    // and we have two operation to perform and return the final value as per the operations 
    // so for that we took the array traversed into it and yes apne dosto ka sath lete hue  kon dodt ?
    // arey if else yhi to dhundh k btayenge ki hmara konsa operation perform krna hai 
    // and then returning the final value

    public static int finalValue(String[] op){
        int n = op.length;
        int x = 0;
        for(int i = 0; i < n; i++){
            if(op[i].equals("--x") || op[i].equals("x--")){
                x--;

            }else{
                x++;
            }
        }
        return x;
    }
    public static void main(String[]args){
        String[] op = {"--x" ,   "x--" , "x--" ,"x--" , "--x"};
        int x = 0;
        int ans = finalValue(op);
        System.out.println("The final value of the x is : " + ans);
    }
    
}
