package Binarytree.travesal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class postorder_recusrion {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        postorder(root,list);
        return list;
    }
    public void postorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        postorder(root.left,list);
        postorder(root.right,list);
    }
}
