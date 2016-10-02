/* Tiara Nguyen
 * */

import java.util.Scanner;

public class _6
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num1;
    
    System.out.println("Give me a number");
    num1 = input.nextInt();
    
    if (num1 == 8 || num1 == 16 || num1 == 80)
      System.out.println("That number is retired from the San Francisco 49ers!");
  }
}