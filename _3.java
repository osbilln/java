/* Tiara Nguyen
 * */

import java.util.Scanner;

public class _3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num1;
    
    System.out.println("Give me a number");
    num1 = input.nextInt();
    
    if (num1 % 2 == 0)
      System.out.println("EVEN");
    else if (num1 % 2 != 0)
      System.out.println("ODD");
  }
}
    
    
    
                            
                                       