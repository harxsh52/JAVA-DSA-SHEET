package BST.Medium;

public class deleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
      if(root==null)return null;
      if(root.val>key){
        root.left=deleteNode(root.left,key);
      }else if(root.val<key){
        root.right=deleteNode(root.right,key);
      }else{
        if(root.left==null && root.right==null){
            return null;
        }
        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }else{
            TreeNode IS=successor(root.right);
            root.val=IS.val;
            root.right=deleteNode(root.right,IS.val);
        }
      }
      return root;
    }
    public TreeNode successor(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
