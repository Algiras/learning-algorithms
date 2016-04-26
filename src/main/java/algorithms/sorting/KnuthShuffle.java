package algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

public class KnuthShuffle {

    public static Comparable[] shuffle(Comparable[] a){
        for(int i = 0; i < a.length; i ++){
            int position = StdRandom.uniform(i + 1);
            exchange(a, i, position);
        }

        return a;
    }

    private static void exchange (Comparable[] a, int i, int j){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
