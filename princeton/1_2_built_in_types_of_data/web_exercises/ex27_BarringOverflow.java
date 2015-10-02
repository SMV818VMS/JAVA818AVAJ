/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex27_BarringOverflow.java
 *  Execution:    java ex27_BarringOverflow a b
 *
 *  Barring overflow, give a code fragment to compute the maximum of 
 *  two integers a and b without using Math.max() or if. 
 *
 ******************************************************************************/

public class ex27_BarringOverflow {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int max = (a + b + Math.abs(a - b)) / 2;

        System.out.println(max);
    }
}

