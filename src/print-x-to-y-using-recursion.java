
 // program to print x to y using recursion

 import java.util.Scanner;

 class RecursionDemo
 {
   //A method for reverse
   public static void power(int base, int exp) {
     if(exp == 1){
       return 1;
     }
     else {
       return (base * power(base,exp-1));
     }
   }

   public static void main(String args[])
   {
     int x=0, y=0;
     System.out.println("Enter value of x and y : ");
     Scanner in = new Scanner(System.in);
     x = in.nextInt();
     y = in.nextInt();
     System.out.print("x to y is:" + power(x,y));
     System.out.println();
   }
 }
