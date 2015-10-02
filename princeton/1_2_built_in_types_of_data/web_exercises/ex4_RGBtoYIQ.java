/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex4_RGBtoYIQ
 *  Execution:    java ex4_RGBtoYIQ R G B
 *
 *
 ******************************************************************************/

public class ex4_RGBtoYIQ {
    public static void main(String[] args) {

        double R = Double.parseDouble(args[0]);
        double G = Double.parseDouble(args[1]);
        double B = Double.parseDouble(args[2]);

        double Y = 0.299*R + 0.587*G + 0.114*B;
        double I = 0.596*R - 0.274*G - 0.322*B;
        double Q = 0.211*R - 0.523*G + 0.312*B;

        System.out.println("Y    = "+ Y); 
        System.out.println("I    = "+ I); 
        System.out.println("Q    = "+ Q); 
    }
}

