package eu.makdeniss.basicprogrammingmodel;

/**
 * Created by Deniss Makarenkov on 09/10/16.
 * Visit http://www.makdeniss.eu/
 */
public class LgMethod {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        LgMethod lgMethod = new LgMethod();
        System.out.println(lgMethod.lg(number));

    }

    static int lg(int x)
    {
        int res = 0;
        while ((x >>= 1) != 0)
            res++;
        return res;
    }
}
