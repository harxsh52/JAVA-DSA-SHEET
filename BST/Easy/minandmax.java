package BST.Easy;

import org.w3c.dom.Node;

public class minandmax {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static int sum=0;
    public static int findMin(Node root) {
        // code here
        sum=Integer.MAX_VALUE;
        M(root);
        int min=sum;
        return min;
    }

    public static int findMax(Node root) {
        
        // code here
        sum=Integer.MIN_VALUE;
        m(root);
        int max=sum;
        return max;
    }
    public static void m(Node root){
        if(root==null)return;
        sum=Math.max(sum,root.data);
        m(root.left);
        m(root.right);
    }
    public static void M(Node root){
        if(root==null)return;
        sum=Math.min(sum,root.data);
        M(root.left);
        M(root.right);
    }
}
