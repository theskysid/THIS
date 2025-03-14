#include <stdio.h>
#include<stdlib.h>
struct node
{
   int data;
   struct node * next;
};
struct node *head = NULL;

void insertatbeg(int val){
   struct node *newnode = (struct node *)malloc(sizeof(struct node));

   newnode->data = val;

   if(head == NULL){
      head = newnode;
      head->next = head;
   } else {
      struct node * temp = head;
      while (temp->next!=NULL)
      {
         temp=temp->next;

      }
      temp->next = newnode;
      newnode->next=head;
      head = newnode;
      
   }
}

void insertatend(int val)
{
   struct node *newnode = (struct node *)malloc(sizeof(struct node));

   newnode->data = val;

   if (head == NULL)
   {
      head = newnode;
      head->next = head;
   }
   else
   {
      struct node *temp = head;
      while (temp->next != NULL)
      {
         temp = temp->next;
      }
      temp->next = newnode;
      newnode->next = head;
   }
}



int main(){
   

   return 0;
}