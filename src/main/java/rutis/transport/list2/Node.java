package rutis.transport.list2;

public class Node {
    public Apple value;
    public Node next;
    public Node prev;

    @Override
    public String toString() {
        return "Node " + "value=" + value + ";";
    }

    public Node(Apple value) {
        this.value = value;
    }

    public Node(Apple value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}