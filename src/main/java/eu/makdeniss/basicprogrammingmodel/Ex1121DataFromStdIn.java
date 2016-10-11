package eu.makdeniss.basicprogrammingmodel;

import eu.makdeniss.StdOut;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Deniss Makarenkov on 11/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class Ex1121DataFromStdIn {

    public class Data {
        public Data(){
        }

        public Data(double v1, double v2, String s1) {
            n1 = v1;
            n2 = v2;
            s = s1;
        }
        public double n1;
        public double n2;
        public String s;

        public LinkedList<Data> getData() {
            int i = 0;
            double v1;
            double v2;
            v1 = v2 = 0;
            String s;
            LinkedList<Data> list = new LinkedList<Data>();

            Scanner input = new Scanner(System.in);

            while(input.hasNext()) {
                switch (i % 3) {
                    case 0: v1 = input.nextFloat();
                        StdOut.println("n1 processed");
                        break;
                    case 1: v2 = input.nextFloat();
                        StdOut.println("n2 processed");
                        break;
                    case 2: s = input.next();
                        StdOut.println("s processed");
                        list.add(new Data(v1, v2, s));
                        break;
                }
                i++;
            }
            input.close();
            return list;
        }

        public void displayList(LinkedList<Data> list) {
            StdOut.println("Item S, Item N1, Item N2, N1 / N2");
            Iterator<Data> iterator = list.iterator();

            while(iterator.hasNext()) {
                Data item = (Data) iterator.next();
                StdOut.println(item.s + ", " + item.n1 + ", " + item.n2 + "," + item.n1 / item.n2);
            }
        }
    }

    public void run() {
        Data data = new Data();
        data.displayList(data.getData());
    }

    public static void main(String[] args) {
        Ex1121DataFromStdIn ex = new Ex1121DataFromStdIn();
        ex.run();

    }
}