#include <stdio.h>
#include<stdlib.h>
struct node {
   int expo;
   int coef;
   struct node *next;
};

struct node *insert(struct node *head, int coef, int exp){
   struct node * newnode = (struct node *)malloc(sizeof(struct node));

   newnode->coef=coef;
   newnode->expo=exp;
   newnode->next = NULL;
   
   if (head==NULL)
   {
      head = newnode;
      return head;
   }

   struct node *temp = head;
   
   while (temp->next!=NULL)
   {
      temp = temp->next;
   }
   temp->next = newnode;
   return head;
}

struct node *add(struct node * poly1, struct node * poly2){
   struct node *result = NULL;
   while (poly1!=NULL && poly2!=NULL)
   {
      if (poly1->expo == poly2->expo)
      {
         result = insert(result,poly1->coef+poly2->coef, poly1->expo);
         poly1 = poly1->next;
         poly2 = poly2->next;
      } else if (poly1->expo > poly2->expo)
      {
         result = insert(result,poly1->coef, poly1->expo);
         poly1 = poly1->next;
      } else {
         result = insert(result,poly2->coef, poly2->expo);
         poly2 = poly2->next;
      }  
   }
   while (poly1!=NULL){
      result = insert(result,poly1->coef, poly1->expo);
      poly1 = poly1->next;
   }
   while (poly2!=NULL)
   {
      result = insert(result,poly2->coef, poly2->expo);
      poly2 = poly2->next;
   }
   
   return result;
}

void print(struct node *head){
   if (head==NULL)
   {
      printf("Empty\n");
      return;
   }
   struct node *temp = head;
   while (temp!=NULL)
   {
      printf("%dx^%d", temp->coef, temp->expo);
      if (temp->next != NULL)
      {
         printf("+");
      }
      temp = temp->next;
   }
}

struct node *mult(struct node * poly1, struct node * poly2){
   struct node *sop = NULL;
   while (poly1!=NULL)
   {
      struct node *product = NULL;
      struct node *temp = poly2;

      while (temp!=NULL)
      {
         product = insert(product,poly1->coef*temp->coef,poly1->expo+poly2->expo);
         temp = temp->next;
      }
      sop = add(sop,product);
      poly1  =poly1->next;
   }
   //delete(product);
   return sop;
}

int main(){
   
   struct node * poly1 = NULL, *poly2=NULL, *result=NULL;
   poly1 = insert(poly1,5,3);
   poly1 = insert(poly1,4,2);
   poly1 = insert(poly1,1,0);
   poly2 = insert(poly2,4,4);
   poly2 = insert(poly2,3,3);
   poly2 = insert(poly2,1,1);
   result=add(poly1,poly2);
   printf("The result is : ");
   print(result);
   result = mult(poly1,poly2);
   print(result);
   
   
   return 0;
}