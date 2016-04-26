package algorithms.unionFind;

public class QuickUnionUF extends UF{

    private int[] sizes;

    public QuickUnionUF(int size){
        super(size);
        sizes = new int[size];
        for(int i = 0; i < size; i++){
            placeHolder[i] = i;
            sizes[i] = 1;
        }
    }


    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if(sizes[i] < sizes[j]){
            placeHolder[i] = j;
            sizes[j] += sizes[i];
        } else {
            placeHolder[j] = i;
            sizes[i] += sizes[j];
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int p) {
        while(p != placeHolder[p]){
            placeHolder[p] = placeHolder[placeHolder[p]];
            p = placeHolder[p];
        }

        return p;
    }

    @Override
    public int find(int p) {
        int root = placeHolder[p];
        if(p == root){
            return p;
        } else {
            return  find(root);
        }
    }

    @Override
    public int count() {
        return placeHolder.length;
    }
}
