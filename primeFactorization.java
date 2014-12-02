import java.util.*;
import java.lang.*;
public class primeFactorization
{
  public static void main(String[] args)
  {
    if (isPrime(19))
      System.out.print(19 * 1);
    else
    {
    System.out.print(primeFactorization(19));
    }
  }
  
  public static boolean isPrime(int num)
  {
   int i = 2;
   while(i < num)
   {
    if (num % i = 0)
      return false;
    else
    {
      return true;
    }
   }
  }
  public static String primeFactorization( int num )
  {
   int i = 2;
   String str = "";
   while (i <= num)
   {
    if (num % i == 0)
    {
     num = num/i; 
     str = str + i + " * ";
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