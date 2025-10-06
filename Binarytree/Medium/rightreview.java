package Binarytree.Medium;

import java.util.ArrayList;
import java.util.List;

public class rightreview {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        rview(root,0,list);
        return list;
    }
    public void rview(TreeNode root,int level,List<Integer> list){
        if(root==null)return;
        if(level==list.size()){
            list.add(root.val);
        }
        rview(root.right,level+1,list);
        rview(root.left,level+1,list);
    }
}
