/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex22_Equatorial2HorizontalCoordinates.java
 *  Execution:    java ex22_Equatorial2HorizontalCoordinates d H y
 *
 *  Takes three double values (d declination , H angle and y latitude) representing
 *  the equatorial coordinates of a star, prints its horizontal coordinates
 *
 ******************************************************************************/

public class ex22_Equatorial2HorizontalCoordinates {
    public static void main(String[] args) {

        double d = Double.parseDouble(args[0]);
        double H = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);

        double altitude = Math.asin(Math.sin(y)*Math.sin(d) + Math.cos(y)*Math.cos(d)*Math.cos(H));
        double azimuth  = Math.acos((Math.cos(y)*Math.sin(d) - Math.sin(y)*Math.cos(d)*Math.cos(H))/Math.cos(altitude));

        System.out.println("altitude   = " + altitude);
        System.out.println("azimuth    = " + azimuth);
    }
}

