/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex18.java
 *  Execution:     java ex18 x y
 *
 *  Being x and y the coordinates of the point in the space, computes its distance
 *  to the origin point (0,0)
 *
 *
 ******************************************************************************/

public class ex18 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double result = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println( result );
    }
}
