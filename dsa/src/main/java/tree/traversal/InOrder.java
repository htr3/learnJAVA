package tree.traversal;

import tree.TreeNode;

public class InOrder {

    public void inOrderTraversal(TreeNode root)  {
        if(root != null) {
            inOrderTraversal(root.getLeft());
            System.out.println(root.getData());
            inOrderTraversal(root.getRight());
        }
    }
}
