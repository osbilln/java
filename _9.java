/* Tiara Nguyen
 * */

import java.util.Scanner;

public class _9
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num1;
    int num2;
    double totalPay;
    double totalPay2;  
    
    System.out.println("How many hours did you work this week?");
    num1 = input.nextInt();
    
    System.out.println("How much did you make per hour?");
    num2 = input.nextInt();
    
    
    if (num1 > 40)
    {
      totalPay = (40 * num2) + ((num1-40)*(1.5 * num2));
    System.out.println(totalPay);
    }
     
    
    else if (num1 < 40)
    {
      totalPay2 = (num1 * num2);
    System.out.println(totalPay2);
    }
  }
}