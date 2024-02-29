//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.NoSuchElementException;

public class Stack<Item> {
    private Node first = null;

    private class Node {
        Node next;
        Item item;
    }

    public void Push(Item item) {
        Node second = this.first;
        this.first = new Node();
        this.first.next = second;
        this.first.item = item;
    }

    public Item Pop() {
        if (this.IsEmpty()) {
            throw new NoSuchElementException("스택이 비어있습니다.");
        } else {
            Item item = this.first.item;
            this.first = this.first.next;
            return item;
        }
    }

    public boolean IsEmpty() {
        return this.first == null;
    }

}
