import java.util.*;

public class Checkerboard2
{
  public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    int x;
    int z = 2;
    int i;
    String a;
    
    System.out.println("How many rows do you want in a checkerboard?");
    x = input.nextInt();
 
    int y = x / z;
  
    for (i = 1; i <= x; i++) {
      if (i % 2 == 0) 
      {
        a = " *";
      }
      else {
        a = "* ";
      }
   
      if (i % 2 == 0) {
        for (int j = 1; j <= x - y - 1; j++)
          System.out.print(a);
      }  
      else 
        for (int j = 1; j <= x - y; j++)
      {
      System.out.print(a); 
      }
      System.out.print("\n"); 
    }
  }
 }