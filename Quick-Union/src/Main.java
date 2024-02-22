public class Main {
    public static void main(String[] args) {
        int N = 10;
        QuickUnion quickUnion = new QuickUnion(N);

        boolean isConnected = quickUnion.find(1,2);
        System.out.println("Is Connected " + isConnected);
        quickUnion.unite(1,2);
        isConnected = quickUnion.find(1,2);
        System.out.println("Is Connected " + isConnected);
    }
}