// C program for Merge Sort
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

void mergeSort(int arr[], int beg, int end)
{
   if (beg < end)
   {
      int mid = beg + (end - beg) / 2;
      mergeSort(arr, beg, mid);
      mergeSort(arr, mid + 1, end);

      merge(arr, beg, mid, end);
   }
}

void merge(int arr[], int beg, int mid, int end)
{
   int i, j, k;
   int n1 = mid - beg + 1;
   int n2 = end - mid;

   int L[n1 + 1], R[n2 + 1];

   for (i = 0; i < n1; i++)
      L[i] = arr[beg + i];
   for (j = 0; j < n2; j++)
      R[j] = arr[mid + 1 + j];
   L[n1] = INT_MAX;
   R[n2] = INT_MAX;
   i = 0;
   j = 0;
   k = end;
   
   for (int k = beg; k <= end; k++)
   {
      if (L[i] <= R[j])
      {
         arr[k] = L[i];
         i++;
      } else {
         arr[k] = R[j];
         j++;
      }
   }
   
}

void printArray(int A[], int size)
{
   int i;
   for (i = 0; i < size; i++)
      printf("%d ", A[i]);
   printf("\n");
}

// Driver code
int main()
{
   int arr[] = {12, 11, 13, 5, 6, 7};
   int arr_size = sizeof(arr) / sizeof(arr[0]);

   printf("Given array is \n");
   printArray(arr, arr_size);

   mergeSort(arr, 0, arr_size - 1);

   printf("\nSorted array is \n");
   printArray(arr, arr_size);
   return 0;
}