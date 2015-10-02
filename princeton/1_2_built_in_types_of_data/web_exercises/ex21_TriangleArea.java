/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex21_TriangleArea.java
 *  Execution:    java ex21_TriangleArea x y z
 *
 *  Takes three double values x y z from command line and prints the area of the
 *  triangle
 *
 ******************************************************************************/

public class ex21_TriangleArea {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double s = (x + y + z)/2;
        double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));

        System.out.println(area);
    }
}

