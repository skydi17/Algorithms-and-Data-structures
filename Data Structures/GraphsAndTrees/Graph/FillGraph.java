import java.util.Scanner;

public class FillGraph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Graph graph = new Graph(n);
        for (int i = 0; i < n; i++) {
            Node node = new Node(n);
            for (int j = 0; j < n; j++) {
                if (in.nextInt() == 1) {
                    node.addChild(graph.nodes[j]);
                }
            }
            graph.nodes[i].setChildren(node.getChildren());
            graph.nodes[i].length = node.length;
        }

        //graph.depthFirstTraversal(graph.nodes[0]);
        graph.breadthFirstTraversal(graph.nodes[0]);
        graph.viewGraph();
    }
}
