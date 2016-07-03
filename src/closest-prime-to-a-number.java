
// find closest prime number to a given number

import java.util.*;
public class NearestPrime
{
    public static boolean isPrime(int n)
    {
        int c=0;
        if(n==1 || n==2)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=ob.nextInt();
        int diff1=0,diff2=0;
        int num1=0,num2=0;
        for(int i=num;;i++)
        {
            if(isPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }
        }
        for(int i=num;;i--)
        {
            if(isPrime(i))
            {
                diff2=num-i;
                num2=i;
                break;
            }
        }
        if(diff1<diff2)
            System.out.println("Nearest Prime Number from " + num + " is " + num1);
        else if(diff2<diff1)
            System.out.println("Nearest Prime Number from " + num + " is " + num2);
        else
            System.out.println("Nearest Prime Number from " + num + " is " + num2 + " and " + num1);
    }
}
