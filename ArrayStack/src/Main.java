import java.util.NoSuchElementException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try {
            stack.Push("First Item");
            String item1 = stack.Pop();
            System.out.println("Pop된 아이템: " + item1);
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("One Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Two Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Three Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Four Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Five Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Six Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Seven Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Eight Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            stack.Push("Nine Item");
            System.out.println("Arr Length is : " + stack.arr.length);
            String item2 = stack.Pop();
            System.out.println("Pop된 아이템: " + item2);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item3 = stack.Pop();
            System.out.println("Pop된 아이템: " + item3);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item4 = stack.Pop();
            System.out.println("Pop된 아이템: " + item4);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item5 = stack.Pop();
            System.out.println("Pop된 아이템: " + item5);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item6 = stack.Pop();
            System.out.println("Pop된 아이템: " + item6);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item7 = stack.Pop();
            System.out.println("Pop된 아이템: " + item7);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item8 = stack.Pop();
            System.out.println("Pop된 아이템: " + item8);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item9 = stack.Pop();
            System.out.println("Pop된 아이템: " + item9);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item10 = stack.Pop();
            System.out.println("Pop된 아이템: " + item10);
            System.out.println("Arr Length is : " + stack.arr.length);
            String item11 = stack.Pop();
            System.out.println("Pop된 아이템: " + item11);
            System.out.println("Arr Length is : " + stack.arr.length);

        } catch (NoSuchElementException e) {
            System.out.println("스택이 비어있습니다. 에러 메시지: " + e.getMessage());
        }
    }
}