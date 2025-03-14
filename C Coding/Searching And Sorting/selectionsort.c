#include <stdio.h>
#include<stdlib.h>

void selectionsort(int a[], int n){
   int min;
   for (int i = 0; i < n; i++)
   {
      min = i;
      for (int j = i+1; j < n; j++)
      {
         if (a[min]>a[j])
         {
            min = j;
         }
      }
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
   }
}
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main(){

   int arr[] = {64, 25, 12, 22, 11};
   int n = sizeof(arr) / sizeof(arr[0]);
    
   printf("Original array: ");
   printArray(arr, n);
    
   selectionsort(arr, n);
    
   printf("Sorted array: ");
   printArray(arr, n);   

   return 0;
}