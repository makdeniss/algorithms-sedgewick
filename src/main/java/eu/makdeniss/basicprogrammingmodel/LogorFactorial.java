package eu.makdeniss.basicprogrammingmodel;

import eu.makdeniss.StdOut;

/**
 * Created by Deniss Makarenkov on 11/10/16.
 * Visit http://www.makdeniss.eu/
 *
 * Log from a factorial
 */
public class LogorFactorial {

    private LogorFactorial(){

    }

    public static long fact(int n) {
        if (n < 2) return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        for (int n = 0; n < 20; n++) {
            StdOut.printf("ln(%d!) = %f\n", n, Math.log(fact(n)));
            StdOut.println("Simple fact: " + fact(n));
        }
    }
}
