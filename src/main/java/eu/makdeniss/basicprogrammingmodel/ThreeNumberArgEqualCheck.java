package eu.makdeniss.basicprogrammingmodel;

/**
 * Created by Deniss Makarenkov on 09/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class ThreeNumberArgEqualCheck {

    public static void main(String[] args) {

        if (args.length == 3) {

            int numberOne = Integer.parseInt(args[0]);
            int numberTwo = Integer.parseInt(args[1]);
            int numberThree = Integer.parseInt(args[2]);

            if (numberOne == numberTwo && numberTwo == numberThree) {
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal");
            }
        }
    }
}
