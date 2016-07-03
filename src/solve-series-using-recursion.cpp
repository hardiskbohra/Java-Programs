
// solve 1+2X3+3X4X5+4X5X6X7…..using recursion for an input ‘n’.

#include<iostream>
using namespace std;

int size = 0;
int sum = 0;

void calculate(int n)
{
    if(n > size)
    {
        return;
    }
    else
    {
        int temp = 1;
        for(int i = 0; i < n; i++ )
        {
            temp = temp * (n+i);
        }
        sum = sum + temp;
        calculate(n+1);
    }
}


int main()
{
    cout << "Enter the Number..!!" << endl;
    cin >> size;

    calculate(1);
    cout << "sum = " << sum << endl;

    return 0;
}
