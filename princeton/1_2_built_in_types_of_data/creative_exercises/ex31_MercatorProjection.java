/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/29/2015
 *  Last updated:  09/29/2015
 *
 *  Compilation:  javac ex31_MercatorProjection.java
 *  Execution:    java ex31_MercatorProjection lam0 lat lon
 *
 *  takes lambda0 and the latitude φ and longitude λ of a point from the command line and prints its projection.
 *  Given 
 *  x = λ - λ0
 *  y = 1/2 ln((1 + sin φ) / (1 - sin φ))
 *
 ******************************************************************************/

public class ex31_MercatorProjection {
    public static void main(String[] args) {

        double lam0 = Double.parseDouble(args[0]);
        double lon  = Double.parseDouble(args[1]);
        double lat  = Double.parseDouble(args[2]);

        double x = lon - lam0;
        double y = 0.5*(Math.log1p((1 + Math.sin(lat))/(1 - Math.sin(lat))));

        System.out.println("x   = "+ x); 
        System.out.println("y   = "+ y);
    }
}

