/* Tiara Nguyen
 * */

import java.util.Scanner;

public class _5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num1;
    
    System.out.println("Give me a number");
    num1 = input.nextInt();
    
    if (num1<10)
      System.out.println("ONE DIGIT");
    else if (num1>=100)
      System.out.println("THREE DIGITS");
    else if (num1>=10 || num1<100)
      System.out.println("TWO DIGITS");
  }
}