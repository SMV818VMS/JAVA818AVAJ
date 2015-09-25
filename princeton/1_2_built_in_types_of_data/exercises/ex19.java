/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex19.java
 *  Execution:     java ex19 min max
 *
 *
 *  Write program that takes two int values min and max from the command
 *  line and prints a random integer between min and max.
 *
 ****************************************************************************/

public class ex19 {

    public static void main(String[] args) {

        int minimum = Integer.parseInt(args[0]);
        int maximum = Integer.parseInt(args[1]);

        int randomNum = minimum + (int) (Math.random() * maximum);
        System.out.println(randomNum);
    }
}
