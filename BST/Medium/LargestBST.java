package BST.Medium;

public class LargestBST {
    static boolean isValidBst(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data >= maxValue || root.data <= minValue) {
            return false;
        }
        return isValidBst(root.left, minValue, root.data) &&
               isValidBst(root.right, root.data, maxValue);
    }

    // Returns size of a tree
    static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    // Finds the size of the largest BST
    static int largestBst(Node root) {
      
        // If tree is empty
        if(root==null){
            return 0;
        }

        // If whole tree is BST
        if(isValidBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            return size(root);
        }

        // If whole tree is not BST
        return Math.max(largestBst(root.left), largestBst(root.right));
    }
}
