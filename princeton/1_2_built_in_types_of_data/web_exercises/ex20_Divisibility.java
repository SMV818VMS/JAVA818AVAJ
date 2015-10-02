/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex20_Divisibility.java
 *  Execution:    java ex20_Divisibility x y
 *
 *  Takes two double values x y from command line and prints True if the values
 *  are divisible by 7
 *
 ******************************************************************************/

public class ex20_Divisibility {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println((x%7 == 0) && (y%7 == 0));
    }
}

