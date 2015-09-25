/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex2.java
 *  Execution:     java ex2 a
 *
 *  Given a, prints the value sin^2(a) + cos^2(a)
 *
 ******************************************************************************/

public class ex2 {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);

        double quad_sin = Math.pow(Math.sin(a), 2);
        double quad_cos = Math.pow(Math.cos(a), 2);

        double result = quad_sin + quad_cos;

        System.out.println(result);
    }
}
