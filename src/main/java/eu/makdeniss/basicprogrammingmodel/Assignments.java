package eu.makdeniss.basicprogrammingmodel;

import eu.makdeniss.StdOut;

/**
 * Created by Deniss Makarenkov on 09/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class Assignments {

    public static void main(String[] args) {

        double t = 9.0;
        int sum = 0;
        int sum2 = 0;

        int a[] = {};
        int b[] = new int[10];

        String s = "";

        System.out.println("2x10^-6 * 1x10^8 = 2x10^2 EQUALS: " + ((2 * (10^-6)) * (10^8)));

        System.out.println("true && false || true && false: " + (true && false || true && false));

        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);

        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum2++;
            }
        }
        StdOut.println(sum2);

        System.out.println((char) ('a' + 4));

        for (int n = 2; n > 0; n /= 2) {
            s = Integer.toBinaryString((n % 2) + 2);
        }
        StdOut.println("Integer to binary string: " + s);

        System.out.println("1 ok");
        for (int i = 0; i < 10; i++) {
            b[i] = 9 - 1;
        }
        System.out.println("2 ok");
        for (int i = 0; i < 10; i++) {
            b[i] = b[b[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("3 ok");

        // transpose

        int n = 0;
        int m = 0;

        int[][] a1,b1;
        a1 = new int[n][m];

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
                a1[i][j] = i + j;

        b1 = new int[m][n];
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
                b1[j][i] = a1[i][j];


    }


}
