
// Rotate array arround pivot.

/*
Algorithm:

        Input : [1, 2, 3, 4, 5, 6, 7, 8, 9] and Pivot = 4

        First find out the pivot index. let pi
        now reverse the array elements from [0..pi]
              [4, 3, 2, 1]
        now reverse other part of the array [pi+1...n-1]
              [9, 8, 7, 6, 5]
        So, the array is now :
              [4, 3, 2, 1, 9, 8, 7, 6, 5]
        Now reverse whole arary
              [5, 6, 7, 8, 9, 1, 2, 3, 4]
*/


public class rotate {

  void reverseArray(int arr[], int start, int end)
  {
    int temp;
    while(start < end)
    {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  int search(int arr[], int pivot)
  {
    int start = 0;
    int end = inputArr.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (key == inputArr[mid]) {
            return mid;
        }
        if (key < inputArr[mid]) {
            end = mid - 1;
        }
        else {
            start = mid + 1;
        }
    }
    return -1;
  }

  void printArray(int arr[])
  {
    for(int i=0; i<arr.length; i++)
        System.out.println(arr[i]);
  }

  void rotateArray(int arr[], int pivot)
  {
    int pivot_index = search(arr, pivot);
    reverseArray(arr, 0, pivot_index);
    reverseArray(arr, pivot_index+1, arr.length-1);
    reverseArray(arr, 0, arr.length-1);
    printArray(arr);
  }


  public static void main(String args[])
  {
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int pivot = 4;
      rotateArray(arr, pivot);
  }
}
