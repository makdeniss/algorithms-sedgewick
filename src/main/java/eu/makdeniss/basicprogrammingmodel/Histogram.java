package eu.makdeniss.basicprogrammingmodel;

import java.util.ArrayList;

/**
 * Created by Deniss Makarenkov on 09/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class Histogram {

    public static void main (String[] args) {
        int[] arr = {5,5,5,4};
        int ret[] = histogram(arr, 6);
        for (int pos : ret) {
            System.out.println(pos);
        }
    }

    public static int[] histogram(int[] arr, int M) {
        //in case not sorted
        java.util.Arrays.sort(arr);

        // new array
        int[] ret = new int[M];
        // set the array length to parameter array length
        for(int i = 0; i < arr.length; ++i) {
            int tmp = arr[i];
            int numcnt = 1;
            while(i < arr.length -1 && tmp == arr[i+1]) {
                ++numcnt;
                ++i;
            }
            ret[tmp] = numcnt;
        }
        return ret;
    }
}
