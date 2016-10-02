/* Tiara Nguyen
 * Period 4
 * */

import java.util.Scanner;

public class Lab_If_Statements
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num1;
    
    System.out.println("Give me the first number");
    num1 = input.nextInt();
    
    if (num1>70)
      System.out.println("Passing");
    else if (num1<= 70)
      System.out.println("Not Passing");
  }
}