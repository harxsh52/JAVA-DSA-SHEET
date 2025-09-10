package BST.Medium;

import java.util.ArrayList;
import java.util.List;

public class inordersuccesor {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    int i=0;
    int max=0;
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        List<Integer> list=new ArrayList<>();
        inorder(root,list,x);
        return max+1>=list.size()?-1:list.get(max+1);
    }
    public void inorder(Node root,List<Integer> list,Node x){
        if(root==null)return;
        inorder(root.left,list,x);
        if(root.data==x.data){
            max=i;
        }
        list.add(root.data);
        i++;
        inorder(root.right,list,x);
    }
}
