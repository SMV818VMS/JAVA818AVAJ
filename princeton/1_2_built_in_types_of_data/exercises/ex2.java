/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex2.java
 *  Execution:     java ex2 a
 *
 *
 *  Write a program that uses Math.sin() and Math.cos() to check that the value 
 *  of sin2θ + cos2θ is approximately 1 for any θ entered as a command-line argument. 
 *  Just print the value.
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
