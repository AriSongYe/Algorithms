import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        try {
            Queue queue = new Queue(10);
            queue.Enqueue("Hello!");
            queue.Enqueue("my");
            queue.Enqueue("name");
            queue.Enqueue("is");
            queue.Enqueue("Songye!");
            queue.Enqueue("Hello!");
            queue.Enqueue("my");
            queue.Enqueue("name");
            queue.Enqueue("is");
            queue.Enqueue("Songye!");
            queue.Enqueue("Hello!");
            queue.Enqueue("my");
            queue.Enqueue("name");
            queue.Enqueue("is");
            while (!queue.IsEmpty()) {
                System.out.println(queue.Dequeue());
            }
        } catch (NoSuchElementException var6) {
            System.out.println("큐가 비어있습니다. 에러 메시지: " + var6.getMessage());
        }
    }
}