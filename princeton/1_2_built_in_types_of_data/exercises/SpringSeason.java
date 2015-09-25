/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac SpringSeason.java
 *  Execution:     java SpringSeason m d
 *
 *  Program SpringSeason.java that takes two int values m and d from the
 *  command line and prints true if day d of month m is between March 20
 *  (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
 *  ****************************************************************************/

public class SpringSeason {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean result = ( ((3 <= m) && ( m <= 6)) && ( ((m == 3) && (d >= 20)) || ((m == 6) && (d <= 20)) || (( 3 < m) && (m < 6)) ) );

        System.out.println(result);
    }
}
