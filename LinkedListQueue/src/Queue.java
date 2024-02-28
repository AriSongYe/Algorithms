import java.util.NoSuchElementException;

public class Queue {
    private Node first = null;
    private Node last = null;

    public static class Node {
        String item;
        Node next;
    }

    public void Enqueue(String item) {
        Node x = new Node();
        x.item = item;
        x.next = null;
        if (IsEmpty())
            first = x;
        else
            last.next = x;
        last = x;

    }

    public String Dequeue() {
        if (IsEmpty())
            throw new NoSuchElementException("큐가 비어있습니다.");
        String item = first.item;
        first = first.next;
        return item;
    }

    public boolean IsEmpty() {
        return first == null;
    }
}
