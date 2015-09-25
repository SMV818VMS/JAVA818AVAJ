/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex4.java
 *  Execution:     java ex4 a b
 *
 *
 *  Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))
 *
 *
 ******************************************************************************/

public class ex4 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean result = (!(a < b) && !(a > b));
        boolean simply_result = (a == b);

        System.out.println(result);
        System.out.println(simply_result);
    }
}
