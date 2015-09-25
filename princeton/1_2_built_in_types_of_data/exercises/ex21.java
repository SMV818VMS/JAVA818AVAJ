/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex21.java
 *  Execution:     java ex21 t
 *
 *  Program that takes a double value t from the command line and
 *  prints the value of sin(2t) + sin(3t). 
 ***************************************************************************/

public class ex21 {

    public static void main(String[] args) {

        double t = Double.parseDouble(args[0]);
        System.out.println(Math.sin(2.0*t) + Math.sin(3.0*t));
    }
}
