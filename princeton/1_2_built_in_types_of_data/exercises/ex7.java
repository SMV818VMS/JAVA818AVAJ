/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex7.java
 *  Execution:     java ex7 b c
 *
 *
 *  Printer programm to test some things
 *
 ******************************************************************************/

public class ex7 {

    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);

        System.out.println(b + "hola");
        System.out.println(b + c + "hola");
        System.out.println((b + c) + "hola");
        System.out.println("hola" + (b + c));
        System.out.println("hola" + b + c);
    }
}
