
// print all the individual digits as word without using if and switch

#include <bits/stdc++.h>
using namespace std;

char word[][10] = {"zero", "one", "two", "three","four",
                   "five", "six", "seven", "eight", "nine"};

void printWordsWithoutIfSwitch(int n)
{
    int digits[10]; 

    int dc = 0;

    do
    {
        digits[dc] = n%10;
        n = n/10;
        dc++;
    } while (n != 0);

    for (int i=dc-1; i>=0; i--)
       cout << word[digits[i]] << " ";
}

int main()
{
    int n = 350;
    printWordsWithoutIfSwitch(n);
    return 0;
}
