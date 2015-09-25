/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex22.java
 *  Execution:     java ex22 x0 v0 t
 *
 *  Program that takes three double values x0, v0, and t from the command
 *  line and prints the value of x0 + v0*t + 1/2 gt^2, where g is the constant
 *  9.800722 m/s^2. (Note : This value the displacement in meters after t seconds
 *  when an object is thrown straight up from initial position x0 at velocity
 *  v0 meters per second.)
 *
 *  ****************************************************************************/

public class ex22 {

    public static void main(String[] args) {

        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;

        System.out.println( x0 + v0*t + (1/2) * g * (Math.pow(t, 2)));
    }
}
