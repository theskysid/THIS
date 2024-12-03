// C program to implement binary search using recursion
#include <stdio.h>

int binarySearch(int arr[], int left, int right, int key)
{

   if (right >= left)
   {

      int mid = left + (right - left) / 2;
      if (arr[mid] == key)
      {
         return mid;
      }
      else if (arr[mid] > key)
      {
         return binarySearch(arr, left, mid - 1, key);
      }
      else
      {
         return binarySearch(arr, mid + 1, right, key);
      }
   }

   return -1;
}

int main(void)
{
   int arr[] = {5, 8, 12, 16, 23, 38, 56, 72, 91};
   int size = sizeof(arr) / sizeof(arr[0]);

   int key = 23;

   int index = binarySearch(arr, 0, size - 1, key);
   if (index == -1)
   {
      printf("Element is not present in array\n\n");
   }
   else
   {
      printf("Element is present at index %d\n\n", index+1);
   }

   return 0;
}