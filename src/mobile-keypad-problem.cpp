
// mobile keypad problem

Example :
        For N=1, number of possible numbers would be 10 (0, 1, 2, 3, …., 9)                 1     2     3
        For N=2, number of possible numbers would be 36                                     4     5     6
        Possible numbers: 00,08 11,12,14 22,21,23,25 and so on.                             7     8     9
        If we start with 0, valid numbers will be 00, 08 (count: 2)                               0
        If we start with 1, valid numbers will be 11, 12, 14 (count: 3)
        If we start with 2, valid numbers will be 22, 21, 23,25 (count: 4)
        If we start with 3, valid numbers will be 33, 32, 36 (count: 3)
        If we start with 4, valid numbers will be 44,41,45,47 (count: 4)
        If we start with 5, valid numbers will be 55,54,52,56,58 (count: 5)







#include <stdio.h>

int row[] = {0, 0, -1, 0, 1};
int col[] = {0, -1, 0, 1, 0};

int getCountUtil(char keypad[][3], int i, int j, int n)
{
    if (keypad == NULL || n <= 0)
        return 0;

    if (n == 1)
        return 1;

    int k=0, move=0, ro=0, co=0, totalCount = 0;

    for (move=0; move<5; move++)
    {
        ro = i + row[move];
        co = j + col[move];
        if (ro >= 0 && ro <= 3 && co >=0 && co <= 2 &&
           keypad[ro][co] != '*' && keypad[ro][co] != '#')
        {
            totalCount += getCountUtil(keypad, ro, co, n-1);
        }
    }

    return totalCount;
}

int getCount(char keypad[][3], int n)
{
    if (keypad == NULL || n <= 0)
        return 0;
    if (n == 1)
        return 10;

    int i=0, j=0, totalCount = 0;
    for (i=0; i<4; i++)
    {
        for (j=0; j<3; j++)
        {
            if (keypad[i][j] != '*' && keypad[i][j] != '#')
            {
                totalCount += getCountUtil(keypad, i, j, n);
            }
        }
    }
    return totalCount;
}

int main(int argc, char *argv[])
{
   char keypad[4][3] = {{'1','2','3'},
                        {'4','5','6'},
                        {'7','8','9'},
                        {'*','0','#'}};
   printf("Count for numbers of length %d: %d\n", 1, getCount(keypad, 1));
   printf("Count for numbers of length %d: %d\n", 2, getCount(keypad, 2));
   printf("Count for numbers of length %d: %d\n", 3, getCount(keypad, 3));
   printf("Count for numbers of length %d: %d\n", 4, getCount(keypad, 4));
   printf("Count for numbers of length %d: %d\n", 5, getCount(keypad, 5));

   return 0;
}
