package algorithms.sorting;


public class SelectionSort {

    public static Comparable[] sort(Comparable[] a){

        for(int i = 0; i < a.length; i++){
            int min = i;
            for(int j = i; j < a.length; j ++){
                if(less(a[j], a[min])){
                    min = j;
                }
            }
            exchange(a, i, min);
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
