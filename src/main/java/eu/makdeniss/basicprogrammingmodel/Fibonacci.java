package eu.makdeniss.basicprogrammingmodel;

import eu.makdeniss.StdOut;

/**
 * Created by Deniss Makarenkov on 11/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class Fibonacci {

    // takes long time
    public static long f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return f(n -1 ) + f(n - 2);
    }

    public static void main(String[] args) {
        for (int n = 0; n < 100; n++) {
//            StdOut.println("n: " + f(n));
            StdOut.println("n: " + fBetter(n));
            StdOut.println(n + " " + fib_alg(n));
        }
    }

    // a better approach
    static long[] fib = new long[100];

    public static long fBetter(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if(fib[n] == 0) {
            fib[n] = fBetter(n-1) + fBetter(n-2);
        }
        return fib[n];
    }


    // phi = (1 + sqrt(5) / 2)
    public static double phi()
    {
        return (1 + Math.sqrt(5)) / 2.0;
    }

    public static long fib_alg(int  n) {
        return (long)Math.round(Math.pow(phi(), n)  / Math.sqrt(5.0) );
    }
}
