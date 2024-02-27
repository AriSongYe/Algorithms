import java.util.NoSuchElementException;

public class Stack {
    private Node first = null;
    private static class Node {
        Node next;
        String item;
    }

    public boolean IsEmpty() {
        return first == null;
    }

    public void Push(String item) {
        Node second = first;
        first = new Node();
        first.next = second;
        first.item = item;
    }

    public String Pop() {
        if (IsEmpty())
            throw new NoSuchElementException("스택이 비어있습니다.");
        String item = first.item;
        first = first.next;
        return item;
    }
}
