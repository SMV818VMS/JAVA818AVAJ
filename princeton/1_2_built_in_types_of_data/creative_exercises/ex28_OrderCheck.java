/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/29/2015
 *  Last updated:  09/29/2015
 *
 *  Compilation:  javac ex28_OrderCheck.java
 *  Execution:    java ex28_OrderCheck x y z
 *
 *  Takes three double values x y z from command line and prints True if the values
 *  are strictly ascending or descending and false otherwise
 *
 ******************************************************************************/

public class ex28_OrderCheck {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        System.out.println( ((x < y ) && (y < z)) || ((x > y) && (y > z)) );
    }
}

