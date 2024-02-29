import java.util.NoSuchElementException;

public class Stack<Item> {
    int N = 0;
    Item[] arr = (Item[]) new Object[4];

    public Stack() {
    }

    public void Push(Item item) {
        if (this.N > this.arr.length - 1) {
            this.DupArr(this.arr.length * 2);
        }

        this.arr[this.N++] = item;
    }

    public Item Pop() {
        if (this.IsEmpty()) {
            throw new NoSuchElementException("스택이 비어있습니다.");
        } else {
            Item item = this.arr[this.N - 1];
            this.arr[this.N - 1] = null;
            --this.N;
            if (this.N < this.arr.length / 4) {
                this.DupArr(this.arr.length / 2);
            }

            return item;
        }
    }

    public boolean IsEmpty() {
        return this.N == 0;
    }

    public void DupArr(int size) {
        Item[] temp = (Item[]) new Object[size];

        for(int i = 0; i < this.N; ++i) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;
    }
}
