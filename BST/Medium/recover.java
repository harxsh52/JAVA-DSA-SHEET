package BST.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class recover {
        public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        extractValues(root, list);
        Collections.sort(list);
        int[] index = {0};
        populateTree(root, list, index);
    }

    private void extractValues(TreeNode root, List<Integer> list) {
        if (root == null) return;
        extractValues(root.left, list);
        list.add(root.val);
        extractValues(root.right, list);
    }

    private void populateTree(TreeNode root, List<Integer> list, int[] index) {
        if (root == null) return;
        populateTree(root.left, list, index);
        root.val = list.get(index[0]);
        index[0]++;
        populateTree(root.right, list, index);
    }
}
