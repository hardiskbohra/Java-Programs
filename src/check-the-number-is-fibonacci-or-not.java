
// check whether the given number is fibonacci number or not

import java.io.*;
import java.util.*;

class IsFibonacci
{
public static void main(String args[])throws IOException
   {
     Scanner sc = new Scanner(System.in);
     int n = sc.nectInt();

     if(n<0)
        System.out.println("Kindly enter a positive number.");
     else
     {
         int a=0, b=1 ,c=0;

          while(c<n)
          {
              c = a + b;
              a = b;
              b = c;
          }

           if(c==n)
              System.out.println("Fibonacci Number.");
           else
              System.out.println("Not a Fibonacci Number.");
     }
   }
}
