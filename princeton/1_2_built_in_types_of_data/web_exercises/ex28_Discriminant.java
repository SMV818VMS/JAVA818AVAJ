/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex28_Discriminant.java
 *  Execution:    java ex28_Discriminant b c d
 *
 *  Discriminant of cubic polynomial. Given the coefficients b, c, and d 
 *  of the cubic polynomial x^3 + bx^2 + cx + d, write an expression to 
 *  compute the discriminant b^2c^2 - 4c^3 - 4b^3d - 27d^2 + 18bcd. 
 ******************************************************************************/

public class ex28_Discriminant {
    public static void main(String[] args) {

        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);

        double discriminant = Math.pow(b,2)*Math.pow(c,2) - 4*Math.pow(c,3) - 4*d*Math.pow(b,3) - 27*Math.pow(d,2) + 18*b*c*d;

        System.out.println(discriminant);
    }
}

