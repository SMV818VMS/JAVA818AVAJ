/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/29/2015
 *  Last updated:  09/29/2015
 *
 *  Compilation:  javac ex27_StdGaussian.java
 *  Execution:    java ex27_StdGaussian
 *
 ******************************************************************************/

public class ex27_StdGaussian {
    public static void main(String[] args) {

        double u = Math.random();
        double v = Math.random();

        double Z = (Math.sin(2 * Math.PI * v)) * Math.pow(-2 * Math.log1p(u), 1/2);

        System.out.println("u     = " + u);
        System.out.println("v     = " + v);
        System.out.println("Z     = " + Z);
    }

}

