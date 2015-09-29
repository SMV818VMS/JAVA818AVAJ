/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/29/2015
 *  Last updated:  09/29/2015
 *
 *  Compilation:  javac ex33_GreatCircle.java
 *  Execution:    java ex33_GreatCircle method x1 y1 x2 y2
 *
 *  Read  takes four command-line arguments - x1, y1, x2, and y2 - 
 *  (the latitude and longitude, in degrees, of two points on the earth) 
 *  and prints out the great-circle distance between them. 
 *  The great-circle distance d (in nautical miles) is given by 
 *  the formula derived from the law of cosines
 *
 *  The parameter method determines the formula used:
 *  0 - basic
 *  1 - haversine formula
 *  2 - Kahan reference
 *
 ******************************************************************************/

public class ex33_GreatCircle {
    public static void main(String[] args) {

        int method = Integer.parseInt(args[0]);
        double x1 = Math.toRadians(Double.parseDouble(args[1]));
        double y1 = Math.toRadians(Double.parseDouble(args[2]));
        double x2 = Math.toRadians(Double.parseDouble(args[3]));
        double y2 = Math.toRadians(Double.parseDouble(args[4]));

        // compute distance

        double distance = 0;

        if (method == 0){
            distance += 60 * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        } else if (method == 1) {
            double a = Math.pow(Math.sin((x2 - x1)/2),2) + Math.cos(x1) * Math.pow(Math.sin((y2 - y1)/2), 2);
            double c = 2 * Math.asin(Math.min(1, Math.sqrt(a)));
            distance += 60 * c;
         } else {
            double delta = y1 - y2;
            double p1 = Math.cos(x2) * Math.sin(delta);
            double p2 = Math.cos(x1) * Math.sin(x2) - Math.sin(x1) * Math.cos(x2) * Math.cos(delta);
            double p3 = Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(delta);

            distance += 60 * Math.atan2(Math.sqrt(p1*p1 + p2*p2), p3);
         }

        // print RESULT
        System.out.println(distance);
    }
}



