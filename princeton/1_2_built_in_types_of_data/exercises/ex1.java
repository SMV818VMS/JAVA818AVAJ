/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex1.java
 *  Execution:     java Quadratic a b
 *
 *  Given a and b, performs a change of variables and prints the result
 *
 ******************************************************************************/

public class ex1 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int t = a;

        b = t;
        a = b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
