
// convert decimal to hexa-decimal numbers

public class MyIntegerToHex {

    public static void main(String a[]){
        Integer i = new Integer(20);
        String hex = Integer.toHexString(i);
        System.out.println("Hex value: "+hex);
    }
}


// CPP Code

#include<stdio.h>
int main() {
	long int decimalNumber,remainder,quotient;
	int i=1,j,temp;
	char hexadecimalNumber[100];
	printf("Enter any decimal number: ");
	scanf("%ld",&decimalNumber);
	quotient = decimalNumber;
	while(quotient!=0) {
		temp = quotient % 16;
		//To convert integer into character
		if( temp < 10)
		  temp =temp + 48;
    else
		  temp = temp + 55;
		hexadecimalNumber[i++]= temp;
		quotient = quotient / 16;
	}
	printf("Equivalent hexadecimal value of decimal number %d: ",decimalNumber);
	for (j = i -1 ;j> 0;j--)
	      printf("%c",hexadecimalNumber[j]);
	return 0;
}
