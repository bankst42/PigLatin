import java.util.*;
import java.lang.*;
public class primeFactorization
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num = Integer.parseInt(scan.nextLine());
    if (isPrime(num))
      System.out.print("1 * " + num);
    else
    {
    System.out.print(primeFactorization(num));
    }
  }
  
  public static boolean isPrime(int num)
  {
   int i = 2;
   while(i < num)
   {
    if (num % i == 0)
    {
      return false;
    }
    i++;
   }
   return true;
  }
  public static String primeFactorization( int num )
  {
   int i = 2;
   String str = "";
   while (i <= num)
   {
    if (num % i == 0)
    {
     if (num/i != 1)
     {
      str = str + i + " * ";
     }
     else
      str = str + i + " ";
     num = num/i; 
     i = 2;
    }
    else
    {
      i++;
    }
   }
   return str;
  }
  
    
    
  }