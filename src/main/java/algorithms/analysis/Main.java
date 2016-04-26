package algorithms.analysis;

import org.apache.commons.lang.time.StopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        int[] sample = new int[]{1, 2, 3, 4, 5};
        System.out.println(binarySearch(sample, 3));
        stopwatch.stop();
        System.out.println(stopwatch);
    }

    public static int binarySearch(int[] list, int value){

        int lo = 0, hi = list.length - 1;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(value < list[mid]){
                hi = mid - 1;
            } else if(value > list[mid]){
                lo = mid + 1;
            } else {
                return  mid;
            }
        }

        return -1;
    }
}
