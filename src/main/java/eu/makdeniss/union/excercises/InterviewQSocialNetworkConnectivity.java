package eu.makdeniss.union.excercises;

import eu.makdeniss.StdIn;
import eu.makdeniss.StdOut;
import eu.makdeniss.union.WeightedQuickUnionUF;

/**
 * Created by Deniss Makarenkov on 09/10/16.
 * Visit http://www.makdeniss.eu/
 *
 * The performance will be M lg N because you are iterating M times (the amount of lines in the log file) and the union operations takes: lg n.
 */
public class InterviewQSocialNetworkConnectivity {

    public static void main(String[] args) {

        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        String date, time;
        //timestamps are sorted ascending
        while (!StdIn.isEmpty()) {

            int p = StdIn.readInt();
            int q = StdIn.readInt();
            date = StdIn.readString();
            time = StdIn.readString();


            uf.union(p, q);

            StdOut.println("[" + p + "," + q + "]");

            if (uf.count() == 1) {
                StdOut.println("All members were connected at: " + date + time);
                break;
            }

        }
    }
}
