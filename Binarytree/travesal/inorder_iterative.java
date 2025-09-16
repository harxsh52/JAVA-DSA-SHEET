package Binarytree.travesal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class inorder_iterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !s.isEmpty()){
            if(curr!=null){
                s.push(curr);
                curr=curr.left;
            }else{
                TreeNode res=s.pop();
                list.add(res.val);
                curr=res.right;
            }
        }
        return list;
    }
}
