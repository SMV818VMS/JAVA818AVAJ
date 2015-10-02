/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex12_Stats5.java
 *  Execution:    java ex12_Stats5
 *
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, their stdev, min value, and max value.                          
 *
 ******************************************************************************/

public class ex12_Stats5 {
    public static void main(String[] args) {

        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        // print 5 values
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        // compute stats
        double min      = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        double max      = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
        double average  = (x1 + x2 + x3 + x4 + x5) / 5;
        double variance = (Math.pow((x1 - average),2) + Math.pow((x2 - average),2) + Math.pow((x3 - average),2) + Math.pow((x4 - average),2) + Math.pow((x5 - average),2))/5;
        double stdev    = Math.sqrt(variance);

        // print stats
        System.out.println("Average = " + average);
        System.out.println("Std. Dev= " + stdev);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}

