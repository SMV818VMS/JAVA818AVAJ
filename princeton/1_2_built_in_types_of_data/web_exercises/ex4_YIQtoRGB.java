/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex4_YIQtoRGB
 *  Execution:    java ex4_YIQtoRGB Y I Q
 *
 *
 ******************************************************************************/

public class ex4_YIQtoRGB {
    public static void main(String[] args) {

        double Y = Double.parseDouble(args[0]);
        double I = Double.parseDouble(args[1]);
        double Q = Double.parseDouble(args[2]);

        double R = 1*Y + 0.956*I + 0.621*Q;
        double G = 1*Y - 0.272*I - 0.647*Q;
        double B = 1*Y - 1.106*I + 1.703*Q;

        System.out.println("R    = "+ R); 
        System.out.println("G    = "+ G); 
        System.out.println("B    = "+ B); 
    }
}

