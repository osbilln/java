/* Tiara Nguyen
 * */

import java.util.Scanner;

public class _4
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num1;
    
    System.out.println("Give me a number");
    num1 = input.nextInt();
    
    if (num1 %5 == 0)
      System.out.println("MULTIPLES OF 5");
    else if (num1 %5 != 0)
      System.out.println("NOT A MULTIPLE OF 5");
  }
}