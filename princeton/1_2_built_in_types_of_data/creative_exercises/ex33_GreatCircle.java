/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/29/2015
 *  Last updated:  09/29/2015
 *
 *  Compilation:  javac ex33_GreatCircle.java
 *  Execution:    java ex33_GreatCircle x1 y1 x2 y2
 *  
 *  Read  takes four command-line arguments - x1, y1, x2, and y2 - 
 *  (the latitude and longitude, in degrees, of two points on the earth) 
 *  and prints out the great-circle distance between them. 
 *  The great-circle distance d (in nautical miles) is given by 
 *  the formula derived from the law of cosines
 *  
 *
 ******************************************************************************/

public class ex33_GreatCircle { 
    public static void main(String[] args) { 
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // compute distance
	double distance = 60 * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));       

        // print stats
        System.out.println(distance);
    }
}



