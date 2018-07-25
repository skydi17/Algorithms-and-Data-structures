import java.util.Scanner;

public class CheckTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BinarySearchTree tree = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            tree.add(in.nextInt());
        }
        System.out.println(tree.search(4));
        System.out.println(tree.search(5));
    }
}
