import java.util.Scanner;

public class CheckTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BinarySearchTree tree = new BinarySearchTree(in.nextInt());
        for (int i = 0; i < n - 1; i++) {
            TreeNode node = new TreeNode(in.nextInt());
            //tree.add(tree.root, node);
        }
    }
}
