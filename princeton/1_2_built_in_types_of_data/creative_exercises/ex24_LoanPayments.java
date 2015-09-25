/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex24_LoanPayments.java
 *  Execution:     java ex24_LoanPayments t P r
 *
 *  Write a program that calculates the monthly payments you would have to make
 *  over a given number of years to pay off a loan at a given interest rate
 *  compounded continuously, taking the number of years t, the principal P, and
 *  the annual interest rate r as command-line arguments. The desired value is given
 *  by the formula Pe^(rt). Use Math.exp().
 *  ****************************************************************************/

public class ex24_LoanPayments {

    public static void main(String[] args) {

        int t = Integer.parseInt(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double result = P * Math.exp((r * t));

        System.out.println(result);
    }
}
