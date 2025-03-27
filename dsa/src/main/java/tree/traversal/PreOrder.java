package tree.traversal;

import tree.TreeNode;

public class PreOrder {

    public void preOrderTraversal(TreeNode root) {
        if(root!= null) {
            System.out.print(root.getData() + "  ");
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }
}
