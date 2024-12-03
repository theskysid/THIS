#include <stdio.h>
#include<stdlib.h>

void bubblesort(int a[], int n){
   int temp;
   for (int i = 0; i < n-1; i++)
   {
      for (int j = 0; j < n-i-1; j++)
      {
         if (a[j]>a[j+1])
         {
            temp = a[j];
            a[j+1] = a[j];
            a[j] = temp;
         }
      }
   }
   printf("\n");
   for (int i = 0; i < n; i++)
   {
      printf("%d ",a[i]);
   }
   
}

int main(){
   int a[20]  = {5, 3, 4, 10, 40};
   bubblesort(a,5);


   return 0;
}