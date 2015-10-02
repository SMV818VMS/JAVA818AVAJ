/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex29_Baricenter.java
 *  Execution:    java ex29_Baricenter m1 m2 a
 *
 *
 ******************************************************************************/

public class ex29_Baricenter {
    public static void main(String[] args) {

        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);
        double a  = Double.parseDouble(args[2]);

	double r1 = a*m2 / (m1 + m2);

        System.out.println(r1);
    }
}

