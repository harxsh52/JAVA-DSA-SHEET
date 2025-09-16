package Binarytree.travesal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class preorder_iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr=s.pop();
            list.add(curr.val);
            if(curr.right!=null)s.push(curr.right);
            if(curr.left!=null)s.push(curr.left);
        }
        return list;
    }
}
