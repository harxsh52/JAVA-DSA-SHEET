package Binarytree.Medium;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class left {
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        lview(root,0,list);
        return list;
    }
    void lview(Node root,int level,ArrayList<Integer> list){
        if(root==null)return;
        if(level==list.size()){
            list.add(root.data);
        }
        lview(root.left,level+1,list);
        lview(root.right,level+1,list);
    }
}
