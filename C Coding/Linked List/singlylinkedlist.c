#include <stdio.h>
#include<stdlib.h>

struct node
{
   int data;
   struct node *next; 
};
struct node *head = NULL;

void insertatbeg(int val){
   struct node *newnode = (struct node *)malloc(sizeof(struct node));

   newnode->data = val;
   if (head==NULL)
   {
      newnode->next = NULL;
      head = newnode;
   } else
   {
      newnode->next = head;
      head = newnode;
   }
} 
   
void insertatpos(int pos, int val){
   struct node *newnode = (struct node *)malloc(sizeof(struct node));
   
   struct node *temp = head;
   
   newnode->data = val;
   newnode->next =NULL;
   
   //for first position
   if (pos==1)
   {
      newnode->next = head;
      head = newnode;
      return;
   }
   

   for (int i = 1; i < pos-1; i++)
   {
      //if pointer temp runs out of linked list
      if (temp == NULL)
      {
         printf("Wrong position");
         free(newnode);
         return;
      }
      temp = temp->next;
      }
   
   //link from newnode to the next node
   newnode->next = temp->next;
   
   //link from existing node to new node
   temp->next = newnode;
}

void insertatend(int val){
   struct node *newnode = (struct node *)malloc(sizeof(struct node));
   struct node *temp = head;
   newnode->data = val;
   newnode->next = NULL;
   
   if (head==NULL)
   {
      head = newnode;
   } else {
      while (temp->next != NULL)
      {
         temp = temp->next;
      }
      temp->next = newnode;
   }
}

void deletefrombeg(){
   
   if (head==NULL)
   {
      printf("Linked list is empty...");
      return;
   }
   struct node *temp = head; //stores the node to be deleted
   head = head->next; //move the head to the next node 

   free(temp); //free memory of temp;
}

void deletefrompos(int pos){
   struct node *temp = head;
   struct node *prev = NULL;

   if (head == NULL)
   {
      printf("Linked list doesnt exist");
      return;
   }
   if (pos==1)
   {
      deletefrombeg();
   }
   for (int i = 1; i < pos; i++){
      prev = temp;
      temp = temp->next;
      if (temp->next==NULL)
      {
         printf("Invalid Position");
      }
   }
   prev->next = temp->next;
   free(temp);
}

void deletefromend(){
   struct node *temp = head;
   struct node *prev=NULL;

   //if there is no node
   if (head==NULL)
   {
      printf("Linked list doesnt exist");
      return;
   }

   //if there is single node
   if (temp->next==NULL)
   {
      head = NULL;
      free(temp);
      return;
   }


   while (temp->next!=NULL)
   {
      prev = temp;
      temp = temp->next;
   }
   prev->next = NULL;
   free(temp);
}

void reverse(){
   struct node *current  = head, *nt = NULL, *prev = NULL;
   while (current!=NULL)
   {
      nt = current->next;
      current->next = prev;
      prev = current;
      current = nt;
   }
   head = prev;
}

void traverse(){
   struct node *temp = head;
   printf("Linked list : ");
   while (temp!=NULL)
   {
      printf("%d  ", temp->data);
      temp = temp->next;
   }
}

void countnodes(){
   struct node *temp = head;
   int c = 0;
   while (temp!=NULL)
   {
      c++;
      temp = temp->next;
   }
   printf("The number of nodes in the linked list are %d", c);
}


int main(){
   
   printf("Siddhant");

   return 0;
}