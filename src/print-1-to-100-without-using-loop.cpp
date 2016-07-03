
// print numbers from 1 to n without using loop

void printNos(unsigned int n)
{
  if(n > 0)
  {
    printNos(n-1);
    printf("%d ",  n);
  }
  return;
}

/* Driver program to test printNos */
int main()
{
  printNos(100);
  getchar();
  return 0;
}
