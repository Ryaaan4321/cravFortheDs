package striver.Treee;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left = null;
        right = null;

    }
}
public class iterativeInorder {
    public static List<Integer> inorderrTrav(TreeNode root){
        List<Integer> ans = new ArrayList<>(0);
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;

        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.empty()){
                    break;
                }
                node = st.pop();
                ans.add(node.data);
                node = node.right;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(9);

        List<Integer> iterativeInOrderElm = inorderrTrav(root);
        System.out.println(" the iterative elm is : " + inorderrTrav(root));
    }
    
}
