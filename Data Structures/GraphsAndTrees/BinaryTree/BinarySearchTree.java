public class BinarySearchTree extends BinaryTree {

    void add(int value) {
        add(this.root, value);
    }

    private void add(TreeNode node, int value) {
        if (node.value != null) {
            if (value == node.value) {
                return;
            }
            if (value > node.value) {
                if(node.rightChild == null)
                    node.rightChild = new TreeNode(value);
                else
                    add(node.rightChild, value);
            } else {
                if(node.leftChild == null)
                    node.leftChild = new TreeNode(value);
                else
                    add(node.leftChild, value);
            }
        } else {
            node.value = value;
        }
    }

    TreeNode search(int value) {
         return search(this.root, value);
    }

    private TreeNode search(TreeNode node, int value) {
        if (node != null) {
            if (node.value == value) {
                return node;
            } else if (node.value > value)
                return search(node.leftChild, value);
            else {
                return search(node.rightChild, value);
            }
        }
        return null;
    }
}
