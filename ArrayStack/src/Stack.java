import java.util.NoSuchElementException;

public class Stack {
    int N = 0; // index
    String [] arr = new String[4];

    public void Push(String item) {
        if (N > arr.length - 1) {
            DupArr(arr.length * 2);
        }
        arr[N++] = item;
    }
    public String Pop() {
        if (IsEmpty())
            throw new NoSuchElementException("스택이 비어있습니다.");
        String item = arr[N-1];
        arr[N-1] = null;
        N -= 1;
        if (N < arr.length / 4)
            DupArr(arr.length / 2);
        return item;
    }

    public boolean IsEmpty() {
        return N == 0;
    }
    public void DupArr(int size) {
        String [] temp = new String[size];
        for (int i = 0; i < N; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

}
