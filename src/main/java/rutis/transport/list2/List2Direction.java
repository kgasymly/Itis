package rutis.transport.list2;

public class List2Direction {

    private Node first;
    private Node last;

    public void add(Apple value) {
        if(first == null) {
            first = last = new Node(value);
        } else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean addWithPosition(int position, Apple value) {
        Node current = first;
        for (int i = 0; i < position; i++) {
            if(current.next == null){
                return false;
            }
            current = current.next;
        }

        Node b = current;
        Node a = new Node(value);
        a.prev = b.prev;
        a.next = b;
        a.prev.next = a;
        b.prev = a;
        return true;
    }

    public void sort() {
        if (first == null || first.next == null) {
            return;
        }

        boolean check;
        Node current;
        Node temp;

        do {
            check = false;
            current = first;
            while (current != null && current.next != null) {
                if (current.value.compare(current.next.value) == 1) {
                    temp = current.next;
                    current.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = current;
                    }
                    temp.prev = current.prev;
                    if (current.prev != null) {
                        current.prev.next = temp;
                    } else {
                        first = temp;
                    }
                    current.prev = temp;
                    temp.next = current;
                    check = true;
                } else {
                    current = current.next;
                }
            }
        } while (check);
    }

    @Override
    public String toString() {
        Node current = first;
        String printText = "";
        while (current.next != null) {
            printText += " | " + current.value;
            current = current.next;
        }
        return printText;
    }

    public Node pop() {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        current.prev = null;
        return current;
    }

    public boolean remove(int position) {
        Node current = first;
        for (int i = 0; i < position; i++) {
            if(current.next == null){
                return false;
            }
            current = current.next;
        }
        Node currentLast = current.next.prev;
        current.next.prev = current.prev;
        current.prev.next = current.next;

        return true;
    }

    public void printReverse() {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(current.value);
        while (current.prev != null) {
            current = current.prev;
            System.out.println(current.value);
        }
    }

    public void print() {
        Node current = first;
        System.out.println(current.value);
        while (current.next != null) {
            current = current.next;
            System.out.println(current.value);
        }
    }
}
