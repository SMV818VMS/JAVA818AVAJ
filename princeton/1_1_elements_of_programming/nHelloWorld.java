/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/23/2015
 *  Last updated:  09/23/2015
 *
 *  Compilation:   javac TenHelloWorld.java
 *  Execution:     java TenHelloWorld n
 *
 *  Prints "Hello, World" n times.
 *
 *----------------------------------------------------------------*/

public class nHelloWorld {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    for(int i=0; i<n; i++){
      System.out.println("Hello, World");
    }
  }
}
