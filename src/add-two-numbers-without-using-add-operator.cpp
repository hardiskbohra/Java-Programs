
// code for adding two numbers without using add(+) operator.

// --------------------------------solution 1--------------------------------------------

#include<stdio.h>

int main(){

    int a,b;
    int sum;

    printf("Enter any two integers: ");
    scanf("%d%d",&a,&b);

    //sum = a - (-b);
    sum = a - ~b -1;

    printf("Sum of two integers: %d",sum);

    return 0;
}

/*
  In c ~ is 1's complement operator. This is equivalent to:
  -b = ~b + 1
  So, a + b
  = a - (-b)
  = a - (~b + 1)
  = a - ~b - 1
*/

// --------------------------------solution 2--------------------------------------------

int main(void)
{
  int a=5,b=4;// you can input those nos from user...
  while(b)
  {
    a++;
    b--;
  }
  printf("%d",a);
}


// --------------------------------solution 3--------------------------------------------


main()
{
  int num1, num2;
  scanf("%d %d",num1, num2);
  printf("%d", Add(num1, num2));
}

int Add(int x, int y)
{
  if (y == 0)
    return x;
  else
    return Add( x ^ y, (x & y) << 1);
}


/*
  int carry = x & y // if its 1 & 1 we get carry
  x = x ^ y; // add all 0 +1 = 1
  y = carry << 1; // now we need to carry
*/
