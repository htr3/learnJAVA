package tree.traversal;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            queue.add(temp.getLeft());
            queue.add(temp.getRight());
            if(temp != null)
                System.out.println(temp.getData());
            queue.remove();
        }
    }
}
