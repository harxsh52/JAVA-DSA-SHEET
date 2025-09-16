package Binarytree.Medium;

public class diameter {
    public int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        int t=height(root);
        return max;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        max=Math.max(max,left+right);
        return 1 +Math.max(left,right);
    }
}
