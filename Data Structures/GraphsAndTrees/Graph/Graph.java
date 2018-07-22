import java.util.LinkedList;

public class Graph {

    Node[] nodes;
    int length;

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(size);
        }
        length = size;
    }

    void viewGraph() {
        for (int i = 0; i < length; i++) {
            System.out.println("Children of node " + i + " isMarked: " + nodes[i].isMarked());
            Node[] children = nodes[i].getChildren();
            for (int j = 0; j < nodes[i].length; j++) {
                System.out.println(j);
            }
        }
    }

    void depthFirstTraversal(Node node) {
        if (node == null) return;
        node.mark();
        for (int i = 0; i < node.length; i++) {
            if (!node.getChildren()[i].isMarked()) {
                depthFirstTraversal(node.getChildren()[i]);
            }
        }

    }

    void breadthFirstTraversal(Node node) {
        if (node == null) return;
        LinkedList queue = new LinkedList();
        queue.addLast(node);
        node.mark();
        while (!queue.isEmpty()) {
            node = (Node)queue.removeFirst();
            Node[] children = node.getChildren();

            for (int i = 0; i < node.length; i++) {
                if (!children[i].isMarked()) {
                    queue.addLast(children[i]);
                    children[i].mark();
                }
            }
        }
    }

    boolean bidirectionalSearch(Node node1, Node node2) {
        return true;
    }

}
