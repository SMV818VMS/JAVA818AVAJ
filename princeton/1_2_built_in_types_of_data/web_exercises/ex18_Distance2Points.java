/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex18_Distance2Points.java
 *  Execution:    java ex_18Distance2Points x1 y1 x2 y2
 *  
 *  Takes four real-valued command line parameters x1, y1, x2, and y2
 *  and prints the Euclidean distance between the points (x1, y1) and 
 *  (x2, y2). Use Math.sqrt(). 
 *
 ******************************************************************************/

public class ex18_Distance2Points {
    public static void main(String[] args) {

        // parse x- and y-coordinates from command-line arguments
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        // compute distance to (0, 0)
        double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
 
        // output distance
        System.out.println("distance from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") = " + dist);
    }   
}
