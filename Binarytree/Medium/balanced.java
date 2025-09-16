package Binarytree.Medium;

public class balanced {
    ublic boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int left=height(root.left);
        int right=height(root.right);
        return Math.abs(right-left)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(height(root.right),height(root.left));
    }
}
