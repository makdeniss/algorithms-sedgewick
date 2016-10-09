package eu.makdeniss.basicprogrammingmodel;

import eu.makdeniss.StdOut;

/**
 * Created by Deniss Makarenkov on 09/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class CheckDouble {

    public static void main(String[] args) {
        double numberOne = 0.2;
        double numberTwo = 0.9;

        int f = 0;
        int g = 1;

        CheckDouble checkDouble = new CheckDouble();

        if (checkDouble.CheckIfWithinRanger(numberOne) && checkDouble.CheckIfWithinRanger(numberTwo)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }

    }

    private boolean CheckIfWithinRanger(double number) {
        boolean result;
        if (number > 0.0 && number < 1.0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
