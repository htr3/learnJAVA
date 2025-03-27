package tree.traversal;

import tree.TreeNode;

public class PostOrder {

    public void postOrderTraversal(TreeNode root) {
        if(root != null) {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println(root.getData());
        }
    }


}
