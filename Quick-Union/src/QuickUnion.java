public class QuickUnion {
    private int[] id;
    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int root(int i) {
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }

    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public void unite(int p, int q) {
        id[root(p)] = root(q);
    }


}
