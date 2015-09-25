/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex14.java
 *  Execution:     java ex14 b c
 *
 *  Given two integers b and c, returns true if b/c or c/b
 *
 ******************************************************************************/

public class ex14 {

    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);

        System.out.println( (b%c + c%b == 0) );
    }
}
