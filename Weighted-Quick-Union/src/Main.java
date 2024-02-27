public class Main {
    public static void main(String[] args) {
        int N = 10;
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(N);

        boolean isConnected = weightedQuickUnion.find(1, 2);
        System.out.println("Is Connected " + isConnected);
        weightedQuickUnion.unite(1, 2);
        isConnected = weightedQuickUnion.find(1, 2);
        System.out.println("Is Connected " + isConnected);
    }
}