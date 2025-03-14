#include <stdio.h>
#include<stdlib.h>

struct node
{
   int data;
   struct node * next;
};

struct node * insertatbeg(struct node *head,int val){
   struct node * newnode = (struct node *)malloc(sizeof(struct node));

   newnode->data = val;
   newnode->next = head;
   head = newnode;
   return head;
}

struct node *concatenate(struct node *head1, struct node *head2){
   if (head1==NULL)
   {
      return head2;
   }
   struct node * curr = head1;

   while (curr->next!=NULL)
   {
      curr = curr->next;
   }
   curr->next = head2;
   return head1;   
}

void traverse(struct node *head){
   struct node *temp = head;
   while (temp!=NULL)
   {
      printf("%d " , temp->data);
      temp = temp->next;
   }
}

int main(){

   int choice, val, pos;
   struct node *head1=NULL, *head2=NULL, *head3=NULL;
   char ch;
   do{
      printf("Insert at beg in first line \n 2. Insert at beg in second list \n 3. concatenate\n 4. display \n ");

   
   printf("Enter the choice ");
   scanf("%d",&choice);
   switch(choice){
      case 1:
         printf("enter the value");
         scanf("%d",&val);
         head1 =insertatbeg(head1,val);
      break;
      case 2 :
         printf("enter the value");
         scanf("%d", &val);
         head2 = insertatbeg(head2, val);
         break;
      case 3:
         
         head3 = insertatbeg(head1, val);
         break;
      case 4: 
         traverse(head3);
         break;
      default:
         printf("WRONG CHOICE !");
         break;

   }
   printf("Do you wish to continue :");
   scanf("%c",&ch);
}
   while(ch=="y"||ch=="Y");
   




   return 0;
}