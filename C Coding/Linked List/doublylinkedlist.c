#include <stdio.h>
#include<stdlib.h>

struct node
{
   int data;
   struct node *next;
   struct node *prev;
};

struct node * start =NULL, *end=NULL;

void insertatbeg(int val){
   struct node *newnode = (struct node *)malloc(sizeof(struct node));
   newnode->data = val;
   newnode->prev =NULL;
   newnode->next =NULL;

   if (start != NULL)
   {
      start = newnode;
      end = newnode;
   } else{
      newnode->next = start;
      start->prev = newnode;
      start = newnode;
   }
}

void insertaftergivenkey(int val, int key){
   struct node *newnode = (struct node *)malloc(sizeof(struct node));
   newnode->data = val;
   newnode->prev = NULL;
   newnode->next = NULL;

   struct node * temp = start;
   while (temp!=NULL & temp->data !=key)
   {
      temp= temp->next;
   }
   newnode->next = temp->next;
   newnode->prev = temp;
   temp->next = newnode;

   if (temp->next!=NULL)
   {
      newnode->next->prev = newnode;
   }
}

void deleteanodewithkeyvalue(int key){
   struct node * temp = start;

   while (temp!=NULL && temp->data != key)
   {
      temp =temp->next;
   }

   if (temp==NULL)
   {
      printf("Key is not in the doubly linked list");
      return;
   }

   //if single key in the linkedlist
   if (temp->prev == NULL && temp->next==NULL && temp->data ==key)
   {
      start =NULL;
      end = NULL;
      free(temp);
      return;
   }
   
   //normal case
   if (temp!=NULL)
   {
      if (temp->prev !=NULL)
      {
         temp->prev->next = temp->next;
      }
      if (temp->next!=NULL)
      {
         temp->next->prev = temp->prev;
      }
   }
}

int main(){
   

   return 0;
}