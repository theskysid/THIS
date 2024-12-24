#include <stdio.h>
#include <stdlib.h>

void swap(int *a, int *b)
{
   int temp = *a;
   *a = *b;
   *b = temp;
}

void maxheapify(int arr[], int n, int i)
{
   int largest = i;
   int left = 2 * i + 1;
   int right = 2 * i + 2;

   if (left < n && arr[left] > arr[largest])
   {
      largest = left;
   }
   if (right < n && arr[right] > arr[largest])
   {
      largest = right;
   }

   if (largest != i)
   {
      swap(&arr[i], &arr[largest]);
      maxheapify(arr, n, largest);
   }
}
void buildmaxheap(int arr[], int n)
{
   for (int i = n / 2 - 1; i >= 0; i--)
   {
      maxheapify(arr,n,i);
   }
}

void heapsort(int arr[], int n){
   buildmaxheap(arr, n);
   for (int i = n-1; i >=1; i--)
   {
      swap(&arr[0], &arr[i]);
      maxheapify(arr, i , 0);
   }
   
}

void printArray(int arr[], int n)
{
   for (int i = 0; i < n; i++)
   {
      printf("%d ", arr[i]);
   }
   printf("\n");
}

int main()
{
   int arr[] = {9, 4, 3, 8, 10, 2, 5};
   int n = sizeof(arr) / sizeof(arr[0]);

   heapsort(arr, n);

   printf("Sorted array is : ");
   printArray(arr, n);
   return 0;

   return 0;
}