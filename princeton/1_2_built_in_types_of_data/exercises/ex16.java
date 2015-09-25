/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex16.java
 *  Execution:     java ex16 G mass1 mass2 r
 *
 *  Given four floats G mass1 and mass2 and r, computes F = G * mass1 * mass2/ r * r
 *
 ******************************************************************************/

public class ex16 {

    public static void main(String[] args) {
        double G = Double.parseDouble(args[0]);
        double mass1 = Double.parseDouble(args[1]);
        double mass2 = Double.parseDouble(args[2]);
        double r = Double.parseDouble(args[3]);

        double F = G * mass1 * mass2 / (Math.pow(r,2));
        System.out.println(F);
    }
}
