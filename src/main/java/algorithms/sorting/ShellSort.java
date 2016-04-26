package algorithms.sorting;

public class ShellSort {
    public static Comparable[] sort(Comparable[] a){
        int lng = a.length;

        int h = 1;
        while (h < lng/3) h = 3 * h + 1;

        while (h >= 1){

            for(int i = h; i < lng; i++){
                for(int j = i; j >= h && less(a[j], a[j-h]); j-=h){
                    exchange(a, j, j-h);
                }

                h = h / 3;
            }

        }

        return a;
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exchange (Comparable[] a, int i, int j){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
