import java.util.NoSuchElementException;

public class Queue {
    String [] arr;
    int head = 0;
    int tail = 0;
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new String[capacity]; // capacity 크기의 배열을 생성합니다.
    }
    public void Enqueue(String item) {
        arr[tail] = item;
        tail = (tail + 1) % capacity;
    }

    public String Dequeue() {
        if (IsEmpty())
            throw new NoSuchElementException("큐가 비어있습니다.");
        String item = arr[head];
        arr[head] = null;
        head = (head + 1) % capacity;
        return item;
    }

    public boolean IsEmpty() {
        return arr[head] == null;
    }

}