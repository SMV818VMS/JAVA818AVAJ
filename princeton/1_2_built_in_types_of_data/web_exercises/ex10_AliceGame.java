/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex10_AliceGame.java
 *  Execution:    java ex10_AliceGame
 *
 *  Guess the biggest number. Consider the following game. Alice 
 *  writes down two integers between 0 and 100 on two cards. Bob gets 
 *  to select one of the two cards and see its value. After looking at 
 *  the value, Bob commits to one of the two cards. If he chooses a card 
 *  with the largest value, he wins; otherwise he loses. Devise a 
 *  strategy (and corresponding computer program) for Bob so that 
 *  he guarantees to win strictly more than half the time. 
 *  
 ******************************************************************************/

public class ex10_AliceGame {
    public static void main(String[] args) {

        //Define the two random numbers of Alice
        int A1 = 0 + (int) (Math.random() * 100);
        int A2 = 0 + (int) (Math.random() * 100);

        //Define the a random number for Bob
        int B = 0 + (int) (Math.random() * 100);

        //Bob accepts card A1 if A1>=B but swaps to A2 if A1<B. So if the mean 
	// absolute difference between Alice's cards is dd then the probability 
	// of Bob choosing the larger of the two using this strategy is 1/2 + d/200 > 1/2. 

        int result = 0;
        if(A1>=B) {
              result += A1;
        }else{
              result += A2;
        }

        //Print
        System.out.println("A1       = "+ A1);
        System.out.println("A2       = "+ A2);
        System.out.println("B        = "+ B);
        System.out.println("Selected = "+ result);
    }
}

