package algorithms.sorting;

public class MergeSort {

    public static Comparable[] sort(Comparable[] a){

        int mid = a.length / 2;
        int bigger = a.length % 2;

        Comparable[] b = new Comparable[mid];
        Comparable[] c;
        if(bigger > 0) {
            c = new Comparable[mid + bigger];
        } else {
            c = new Comparable[mid];
        }

        System.arraycopy(a, 0, b, 0, mid);
        System.arraycopy(a, mid, c, 0, a.length - mid);

        InsertionSort.sort(b);
        InsertionSort.sort(c);

        for (int i = 0; i < a.length; i++) {
            if(i < mid){
                a[i] = b[i];
            } else {
                a[i] = c[i - mid];
            }
        }

        merge(a, 0, mid-1, a.length - 1);

        return a;
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi){
        Comparable[] aux = new Comparable[a.length];

        assert isSorted(a, lo, mid);
        assert isSorted(a, mid + 1, hi);

        System.arraycopy(a, 0, aux, 0, a.length);

        int i = lo,
            j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if(i > mid) a[k] = aux[j++];
            else if(j > hi) a[k] = aux[i++];
            else if(less(aux[j], aux[i])) a[k] = aux[j++];
            else  a[k] = aux[i++];
        }

        assert isSorted(a, lo, hi);
    }

    private static void testPrint(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi){
        for (int i = lo + 1; i < hi; i++) {
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
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
