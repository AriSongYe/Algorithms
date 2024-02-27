public class WeightedQuickUnion {
    private int[] id;
    private int[] sz;
    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int root(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public void unite(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (sz[rootP] > sz[rootQ]) {
            id[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        }
        else {
            id[rootQ] = rootP;
            sz[rootQ] += sz[rootP];
        }
    }
}
