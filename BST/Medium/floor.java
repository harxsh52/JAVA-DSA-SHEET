package BST.Medium;

import org.w3c.dom.Node;

public class floor {
    public static int floor(Node node, int key ) {
        // Code here
        if(node==null)return -1;
        int floor=-1;
        while(node!=null){
            if(node.data<=key){
                floor=node.data;
                node=node.right;
            }else{
                node=node.left;
            }
        }
        return floor;
    }
}
