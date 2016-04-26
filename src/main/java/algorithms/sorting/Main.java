package algorithms.sorting;

public class Main {
    public static void main(String[] args){

        Integer[] list = {6, 5, 4};

        Comparable[] b = MergeSort.sort(list);

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }

}
