package Binarytree.travesal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class preorder_recursion {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
