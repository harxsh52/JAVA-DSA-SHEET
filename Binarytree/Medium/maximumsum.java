package Binarytree.Medium;

public class maximumsum {
    private int sum;
    public int maxPathSum(TreeNode root) {
        sum=Integer.MIN_VALUE;
        int t=helper(root);
        return sum;
    }
    public int helper(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(helper(root.left),0);
        int right=Math.max(helper(root.right),0);
        sum=Math.max(sum,left+right+root.val);
        return root.val+Math.max(left,right);
    }
}
