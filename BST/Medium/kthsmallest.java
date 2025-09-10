package BST.Medium;

import java.util.ArrayList;
import java.util.List;

public class kthsmallest {
    private List<Integer> result;
    public int kthSmallest(TreeNode root, int k) {
        result=new ArrayList<>();
        inorder(root);
        return result.get(k-1);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
}
}
