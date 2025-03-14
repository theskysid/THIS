#include <stdio.h>
#include<stdlib.h>

void quicksort(int a[], int low, int high)
{
   if (low < high)
   {
      int pivot_index = partition(a, low, high);
      quicksort(a, low, pivot_index - 1);
      quicksort(a, pivot_index + 1, high);
   }
}

int partition(int a[], int low, int high)
{
   int pivot = a[high]; // Choosing last element as pivot
   int i = low - 1;     // `i` tracks the smaller element's index

   for (int j = low; j < high; j++)
   {
      if (a[j] < pivot)
      {
         i++; // Move `i` forward
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
      }
   }

   // Swap pivot with the element at i+1 to put pivot in the correct position
   int temp = a[i + 1];
   a[i + 1] = a[high];
   a[high] = temp;

   return i + 1; // Return the partition index
}

void printArray(int arr[], int size)
{
   for (int i = 0; i < size; i++)
   {
      printf("%d ", arr[i]);
   }
   printf("\n");
}

// Driver Code
int main()
{
   int arr[] = {2,8,7,1,3,5,6,4};
   int n = sizeof(arr) / sizeof(arr[0]);

   printf("Original array: ");
   printArray(arr, n);

   quicksort(arr, 0, n - 1);

   printf("Sorted array: ");
   printArray(arr, n);

   return 0;
}