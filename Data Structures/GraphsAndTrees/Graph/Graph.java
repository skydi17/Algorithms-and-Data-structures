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
            System.out.println("Children of node " + i);
            Node[] children = nodes[i].getChildren();
            for (int j = 0; j < children.length; j++) {
                if (children[j] != null) {
                    System.out.println(j);
                }
            }
        }
    }

}
