package BST.Medium;

public class preorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int d:preorder){
            root=insert(root,d);
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int val){
        if(root==null)return new TreeNode(val);
        if(root.val>val){
            root.left=insert(root.left,val);
        }
        if(root.val<val){
            root.right=insert(root.right,val);
        }
        return root;
    }
}
