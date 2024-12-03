#include <stdio.h>
#include <stdlib.h>
struct node
{
   int data;
   struct node *next;
};
struct node *front = NULL;
struct node *rear = NULL;
void insert();
void delete();
void display();
void main()
{
   int choice;
   while (choice != 4)
   {
      printf("\n**********Main Menu**********\n");
      printf("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");
      printf("\nEnter your choice : ");
      scanf("%d", &choice);
      switch (choice)
      {
      case 1:
         insert();
         break;
      case 2:
         delete ();
         break;
      case 3:
         display();
         break;
      case 4:
         exit(0);
         break;
      default:
         printf("\nEnter valid choice...");
      }
   }
}
void insert()
{
   // struct node *ptr;
   int item;
   struct node *newNode = (struct node *)malloc(sizeof(struct node));
   if (newNode == NULL)
   {
      printf("\nOVERFLOW - meaning memory allocation failed");
      return;
   }
   else
   {
      printf("\nEnter value : ");
      scanf("%d", &item);
      newNode->data = item;
      if (front == NULL)
      {
         front = newNode;
         rear = newNode;
         front->next = NULL;
         rear->next = NULL;
      }
      else
      {
         rear->next = newNode;
         rear = newNode;
         rear->next = NULL;
      }
   }
}
void delete()
{
   int item;
   struct node *temp;
   if (front == NULL)
   {
      printf("\nUNDERFLOW... queue doesnt exit...");
      return;
   }
   else
   {
      item = front->data;
      temp = front;
      front = front->next;
      free(temp);
      printf("%d is dequeued from the queue...", item);
   }
}
void display()
{
   struct node *temp = front;
   if (front == NULL)
   {
      printf("\nEmpty queue");
   }
   else
   {
      printf("\nPrinting values:\t");
      while (temp != NULL)
      {
         printf("%d  ", temp->data);
         temp = temp->next;
      }
   }
}