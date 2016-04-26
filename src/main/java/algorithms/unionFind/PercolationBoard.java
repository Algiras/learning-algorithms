package algorithms.unionFind;

public class PercolationBoard {
    private int height;
    private int width;
    private QuickUnionUF quickUnionUF;

    public PercolationBoard(int height, int width){
        this.height = height;
        this.width = width;
        quickUnionUF = new QuickUnionUF(height * width + 2);

        for(int i = 1; i <= width; i ++){
            quickUnionUF.union(0, i);
            if(i == 1){
                quickUnionUF.union(width * height + 1, width * height);
            } else {
                quickUnionUF.union(width * height + 1, width * height - i + 1);
            }
        }
    }

    public void set(int x, int y){
        if(x > 0 && x < width + 2 && y > 0 && y < height + 2){
            int position = x * y;

            if(x - 1 >= 1){
                quickUnionUF.union(position, position - 1);
            }

            if(x + 1 <= width){
                quickUnionUF.union(position, position + 1);
            }

            if(position - width >= 1){
                quickUnionUF.union(position, position - width);
            }

            if(position + 1 <= height){
                quickUnionUF.union(position, position + width);
            }

        }
    }

    public boolean connected(int x, int y, int x2, int y2){
        int position = x * y;
        int destination = x2 * y2;

        return quickUnionUF.connected(position, destination);
    }

    public boolean endsConnect(){
        return quickUnionUF.connected(0, quickUnionUF.count() - 1);
    }
}
