/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/29/2015
 *  Last updated:  09/29/2015
 *
 *  Compilation:  javac ex32_RGBtoCMYK
 *  Execution:    java ex32_RGBtoCMYK R G B
 *
 *  Color conversion. Several different formats are used to represent color. 
 *  For example, the primary format for LCD displays, digital cameras, and web pages, 
 *  known as the RGB format, specifies the level of red (R), green (G), and blue (B) 
 *  on an integer scale from 0 to 255. The primary format for publishing books and 
 *  magazines, known as the CMYK format, specifies the level of cyan (C), magenta 
 *  (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0. Write a program 
 *  RGBtoCMYK that converts RGB to CMYK. Take three integers - red, green, and blue 
 *  - from the command line and print the equivalent CMYK values. If the RGB values 
 *  are all 0, then the CMY values are all 0 and the K value is 1; otherwise, use the
 *  formulas: 
 *
 ******************************************************************************/

public class ex32_RGBtoCMYK {
    public static void main(String[] args) {

        double R = Double.parseDouble(args[0]);
        double G = Double.parseDouble(args[1]);
        double B = Double.parseDouble(args[2]);

        double white = Math.max(R/255.0, Math.max(G/255.0, B/255.0));
        double C = (white - (R/255.0))/white;
        double M = (white - (G/255.0))/white;
        double Y = (white - (B/255.0))/white;
        double K = 1 - white;

        System.out.println("cyan      = "+ C); 
        System.out.println("magenta   = "+ M); 
        System.out.println("yellow    = "+ Y); 
        System.out.println("black     = "+ K); 
    }
}

