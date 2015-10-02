/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex23_BMI.java
 *  Execution:    java ex23_BMI height weight
 *
 *  Takes two double values height and weight from command line and prints
 *  the BMI
 *
 ******************************************************************************/

public class ex23_BMI {
    public static void main(String[] args) {

        double height = Double.parseDouble(args[0]);
        double weight = Double.parseDouble(args[1]);

        System.out.println(weight/Math.pow(height,2));
    }
}

