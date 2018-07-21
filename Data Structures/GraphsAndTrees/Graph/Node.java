class Node {
    public Node[] children;
    private int length;

    Node(int size) {
        children = new Node[size];
        length = 0;
    }

    public Node[] getChildren() {
        return children;
    }

    public void addChild(Node node) {
        children[length] = node;
        length++;
    }
}