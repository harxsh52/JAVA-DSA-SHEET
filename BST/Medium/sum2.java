package BST.Medium;

import java.util.HashSet;
import java.util.Set;

public class sum2 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set=new HashSet<>();
        return dfs(root,k,set);
    }
    public boolean dfs(TreeNode root,int k,Set<Integer> set){
        if(root==null)return false;
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return dfs(root.left,k,set)|| dfs(root.right,k,set);
    }
}
