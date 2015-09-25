/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/25/2015
 *  Last updated:  09/25/2015
 *
 *  Compilation:   javac ex13.java
 *  Execution:     java ex13
 *
 *  The print is false as the sqrt gives a float from an integer so 2.000000 != 2
 ******************************************************************************/

public class ex13 {

    public static void main(String[] args) { 
        System.out.println(Math.sqrt(2) * Math.sqrt(2) == 2);
    }
}
