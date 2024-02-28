
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue("Hello!");
        queue.Enqueue("my");
        queue.Enqueue("name");
        queue.Enqueue("is");
        queue.Enqueue("Songye!");
        while (!queue.IsEmpty()) {
            System.out.println(queue.Dequeue());
        }
        queue.Dequeue();
    }
}