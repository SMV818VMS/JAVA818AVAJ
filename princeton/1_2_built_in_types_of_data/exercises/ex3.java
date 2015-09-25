/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex3.java
 *  Execution:     java ex3 a b
 *
 *
 *  Suppose that a and b are boolean values. Show that the expression 
 *  (!(a && b) && (a || b)) || ((a && b) || !(a || b)) is equivalent to true. 
 *
 ******************************************************************************/

public class ex3 {

    public static void main(String[] args) {
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);

        boolean result = (!(a && b) && (a || b)) || ((a && b) || !(a || b));

        System.out.println(result);
    }
}
