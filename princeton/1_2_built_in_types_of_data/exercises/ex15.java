/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex15.java
 *  Execution:     java ex15 a b c
 *
 *  Given three integers b and c, prints true if any one of them
 *  is strictly greater than the sum of the other two and false otherwise.
 *
 ******************************************************************************/

public class ex15 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println( (a > b + c) || (b > a + c) || (c > a + b) );
    }
}
