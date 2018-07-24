public class BinarySearchTree extends BinaryTree {

    BinarySearchTree(int value) {
        super(value);
    }

    TreeNode search(TreeNode node, int value) {
        search(node.leftChild, value);
        if (node.value == value) {
            return node;
        }
        search(node.rightChild, value);
        return null;
    }
}
