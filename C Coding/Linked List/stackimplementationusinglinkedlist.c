#include <stdio.h>
#include <stdlib.h>
void push();
void pop();
void display();
struct node
{
    int val;
    struct node *next;
};
struct node *top=NULL;

void main()
{
    int choice = 0;
    printf("\n****Stack operations using linked list****\n");
    while (choice != 4)
    {
        printf("\n\nChose one from the below options...\n");
        printf("\n1.Push\n2.Pop\n3.Show\n4.Exit");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        {
            push();
            break;
        }
        case 2:
        {
            pop();
            break;
        }
        case 3:
        {
            display();
            break;
        }
        case 4:
        {
            printf("Exiting....");
            break;
        }
        default:
            printf("Please enter valid choice");
        };
    }
}
void push()
{
    int val;
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL)
    {
        printf("Memory Allocatin Failed to add a node in linked list");
        return;
    }
    printf("Enter the value : ");
    scanf("%d", &val);
    if (top == NULL)
    {
        newNode->val = val;
        newNode->next = NULL;
        top = newNode;
    }
    else
    {
        newNode->val = val;
        newNode->next = top;
        top = newNode;
    }
    printf("Item pushed...\n\n");
}

void pop()
{
    int item;
    struct node *temp;
    if (top == NULL)
    {
        printf("Underflow - meaning no element in the stack");
    }
    else
    {
        item = top->val; //value stored to display at the terminal
        temp = top;
        top = top->next;
        free(temp); // to free the existing memory of the top
        printf("%d is popped from the stack" , item);
    }
}
void display()
{
    struct node *temp = top;
    if (temp == NULL)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Printing Stack elements \n");
        while (temp != NULL)
        {
            printf("%d\n", temp->val);
            temp = temp->next;
        }
    }
}
