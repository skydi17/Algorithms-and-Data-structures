public class BinaryTree {
    TreeNode root;

    BinaryTree(){
        root = new TreeNode();
    }

    void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.leftChild);
            System.out.println(node.value);
            inOrderTraversal(node.rightChild);
        }
    }

    void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.value);
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }

    }

    void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.println(node.value);
        }
    }
}
