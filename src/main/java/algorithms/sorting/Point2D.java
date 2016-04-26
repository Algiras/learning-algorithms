package algorithms.sorting;

public class Point2D {
    private final double x, y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static int ccw(Point2D a, Point2D b, Point2D c){
        double area2 = (b.x - a.x) * (c.y - a.y) - (b.y * a.y) * (c.x - a.x);

        if(area2 < 0) return -1;
        if(area2 > 0) return 1;
        else return 0;
    }
}
