package algorithms.unionFind;

public abstract class UF {
    protected int[] placeHolder;

    UF(int size){
        placeHolder = new int[size];
    }

    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

    public abstract int find(int p);

    public abstract int count();
}
