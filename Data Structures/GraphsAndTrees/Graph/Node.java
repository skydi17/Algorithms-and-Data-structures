class Node {
    private Node[] children;
    public int length;
    private boolean marked = false;

    Node(int size) {
        children = new Node[size];
        length = 0;
    }

    public Node[] getChildren() {
        return children;
    }

    public void addChild(Node node) {
        children[length] = node;
        this.length++;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    void mark() {
        marked = true;
    }

    boolean isMarked() {
        return marked;
    }
}