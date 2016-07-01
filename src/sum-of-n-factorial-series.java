
// find out the sum of factorials of 1 to n numbers (If n=4 then 1! + 2! + 3! + 4! = 33)

// we are performing the recursion to find out the factorial as well as the sum...


import java.util.Scanner;

public class Demo
{
  public static void main()
  {
    Scanner sc = new Scanner(System.in);
    int terms = sc.nextInt();

    System.out.println(sum(terms));
  }

  public int sum(int terms)
  {
       return terms>0 ? (fact(terms) + sum(terms-1)) : 0 ;
  }

  public int fact(int n)
  {
       return n<2 ? 1 : n * fact(n-1) ;
  }
}
