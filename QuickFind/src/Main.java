//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int N = 10;

        QuickFind quickFind = new QuickFind(N);

        boolean  isConnected = quickFind.find(1, 2);
        System.out.println("Is Connected " + isConnected);

        quickFind.unite(1, 2);
        isConnected = quickFind.find(1, 2);
        System.out.println("Is Connected " + isConnected);
    }
}

