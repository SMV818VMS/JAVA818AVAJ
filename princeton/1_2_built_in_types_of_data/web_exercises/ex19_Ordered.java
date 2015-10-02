/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex19_Ordered.java
 *  Execution:    java ex19_Ordered x y z
 *
 *  Takes three double values x y z from command line and prints True if the values
 *  are strictly ascending or descending and false otherwise
 *
 ******************************************************************************/

public class ex19_Ordered {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        System.out.println( ((x < y ) && (y < z)) || ((x > y) && (y > z)) );
    }
}

