
// find duplicate and similar number from given array.

Method:1 [O(nLogn)]
    1) Sort the input array.
    2) Traverse the array and check for missing and repeating.

Method:2 [O(n) and Auxiliary space : O(n)]
    1) create a temp array temp[] of size n with all initial values as 0.
    2) traverse the input array arr[], and do following for each arr[i]
      if(temp[arr[i]] == 0) temp[arr[i]] = 1;
      if(temp[arr[i]] == 1) output “arr[i]” //repeating
    3) traverse temp[] and output the array element having value as 0 // missing

Method:3 [O(n)]
    traverse the array. while traversing, use absolute value of every element as index and
    make the value at this index as negative to mark it visited.
    if something is already marked negative then this is the repeating element.
    to find missing, traverse the array again and look for a positive value.

void printTwoElements(int arr[], int size)
{
    int i;
    printf("\n The repeating element is");

    for(i = 0; i < size; i++)
    {
        if(arr[abs(arr[i])-1] > 0)
            arr[abs(arr[i])-1] = -arr[abs(arr[i])-1];
        else
            printf(" %d ", abs(arr[i]));
    }

    printf("\nand the missing element is ");
    for(i=0; i<size; i++)
    {
        if(arr[i]>0)
            printf("%d",i+1);
    }
}
