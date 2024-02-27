import java.util.NoSuchElementException;
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try {
            stack.Push("First Item");
            String item1 = stack.Pop();
            System.out.println("Pop된 아이템: " + item1);
            stack.Push("First Item");
            stack.Push("Second Item");
            String item2 = stack.Pop();
            System.out.println("Pop된 아이템: " + item2);
            String item3 = stack.Pop();
            System.out.println("Pop된 아이템: " + item3);
            String item4 = stack.Pop();
            System.out.println("Pop된 아이템: " + item4);
        } catch (NoSuchElementException e) {
            System.out.println("스택이 비어있습니다. 에러 메시지: " + e.getMessage());
        }
    }
}