import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        try {
            stack.Push("First Item");
            String item = stack.Pop();
            System.out.println(item);
            stack.Pop();
        } catch (NoSuchElementException var6) {
            System.out.println("스택이 비어있습니다. 에러 메시지: " + var6.getMessage());
        }
    }
}