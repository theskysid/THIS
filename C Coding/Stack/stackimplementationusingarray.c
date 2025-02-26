#include <stdio.h>
#include<stdlib.h>

#define SIZE 10
int stack[SIZE];
int top = -1;

int isEmpty(){
   if (top==-1)
   {
      return 1;
   } else {
      return 0;
   }
}

int isFull(){
   if (top==SIZE-1)
   {
      return 1;
   } else {
      return 0;
   }
}

int peek(){
   return stack[top];
}

int push(int val){
   if (!isFull())
   {
      top = top+1;
      stack[top] = val;
   } else {
      printf("Overflow");
   }
   
}

int pop(){
   int d;
   if (!isEmpty())
   {
      d = stack[top];
      top--;
   } else{
      printf("Underflow");
   }
   return d;
}

int main(){
   
   int choice,val;
   char ch;

   do
   {
      printf("1. PUSH\n2. POP\n3. PEEK\n");
      scanf("%d", &choice);
      switch (choice)
      {
      case 1:
         printf("Enter value to push : ");
         scanf("%d", &val);
         push(val);
         break;

      case 2:
         val = pop();
         printf("Deleted element from the stack is %d", val);
         break;

      case 3:
         printf("Topmost element of the stack is %d\n", peek());
         break;

      default:
         printf("Invalid choice");
      }

      printf("To continue press y...\n");
      scanf(" %c", &ch);

   } while (ch =='y' || ch == 'Y');
   
   return 0;

}