package BST.Medium;

import org.w3c.dom.Node;

public class ceil {
    class Node {
        int val;
       Node left;
       Node right;

        Node() {
        }

       Node(int val) {
            this.val = val;
        }

       Node(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int findCeil(Node node, int key) {
        // Code here
        if(node==null)return -1;
        int floor=-1;
        while(node!=null){
            if(node.data>=key){
                floor=node.val;
                node=node.left;
            }else{
                node=node.right;
            }
        }
        return floor;
    }
}
