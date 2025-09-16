package Binarytree.travesal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class postorder_iterative {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                list.add(curr.val);
                curr=curr.right;
            }
            TreeNode node=s.pop();
            curr=node.left;
        }
        Collections.reverse(list);
        return list;
    }
}
