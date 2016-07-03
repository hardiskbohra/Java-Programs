
// program to reverse the number using recursion

import java.util.Scanner;

class RecursionReverseDemo
{
  //A method for reverse
  public static void reversDigits(int number) {
    System.out.println(number % 10);
    if (number >= 10) {
      reversDigits(number / 10);
    }
  }

  public static void main(String args[])
  {
    int num=0;
    System.out.println("Input your number and press enter: ");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    System.out.print("Reverse of the input number is:");
    reversDigits(num);
    System.out.println();
  }
}
