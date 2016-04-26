package algorithms.unionFind;

public class QuickFindUF extends UF{

    public QuickFindUF(int size){
        super(size);
        for(int i = 0; i < size; i++){
            placeHolder[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if(!connected(p, q)) {

            int initial = find(p);
            int previous = find(q);

            for (int i = 0; i < placeHolder.length; i++) {
                if (placeHolder[i] == initial) {
                    placeHolder[i] = previous;
                }
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int find(int p) {
        return placeHolder[p];
    }

    @Override
    public int count() {
        return placeHolder.length;
    }
}
