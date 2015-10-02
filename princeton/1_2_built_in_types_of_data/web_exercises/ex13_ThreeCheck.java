/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       02/10/2015
 *  Last updated:  02/10/2015
 *
 *  Compilation:  javac ex13_ThreeCheck.java
 *  Execution:    java ex13_ThreeCheck x y z
 *
 *  Takes three double values x y z from command line and prints True if 
 *  all three are equal, and false otherwise
 *
 ******************************************************************************/

public class ex13_ThreeCheck {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        System.out.println((x == y) && (y == z));
    }
}

