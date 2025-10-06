package Binarytree.Medium;

import java.util.ArrayList;
import java.util.Stack;

import org.w3c.dom.Node;

public class boundary {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(node==null)return list;
        if(!isleaf(node)){
            list.add(node.data);
        }
        left(node.left,list);
        Leaf(node,list);
        right(node.right,list);
        return list;
    }
    public boolean isleaf(Node node){
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }
    public void left(Node root,ArrayList<Integer> list){
        if(root==null)return;
        
        Node curr=root;
        while(!isleaf(curr)){
            list.add(curr.data);
            if(curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
    }
    public void Leaf(Node node,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        if(isleaf(node)){
            list.add(node.data);
        }
        Leaf(node.left,list);
        Leaf(node.right,list);
    }
    public void right(Node node,ArrayList<Integer> list){
        if(node==null)return;
        Node curr=node;
        Stack<Integer> s=new Stack<>();
        while(!isleaf(curr)){
            s.push(curr.data);
            if(curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
        while(!s.isEmpty()){
            list.add(s.pop());
        }
    }
}
