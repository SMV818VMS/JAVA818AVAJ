/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       10/02/2015
 *  Last updated:  10/02/2015
 *
 *  Compilation:  javac ex11_FibonacciNumbers.java
 *  Execution:    java ex11_FibonacciNumbers
 *
 *  Program to print the Fibonacci number series
 *  
 ******************************************************************************/
import java.util.*;

public class ex11_FibonacciNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
            System.out.print("Introduce a number greater than 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("The " + numero + " first Fibonacci numbers are:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}

