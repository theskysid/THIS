#include <stdio.h>
#include <limits.h>
#define size 5

int rear = -1;

struct item{
	int val;
	int priority;
} pqueue[5];


void enqueue(int value, int pr){
	if (rear == size-1){
		printf("Overflow");
	} else {
		rear = rear+1;
		pqueue[rear].val = value;
		pqueue[rear].priority = pr;	
	}
}

int peek(){
	int i = 0;
	int maxpr = INT_MIN;
	int index;
	for (i = 0; i<=rear; i++){
		if (maxpr<pqueue[i].priority){
			maxpr = pqueue[i].priority;
			index = i;
		} 
	}
	return index;
}

void dequeue(){
	int index = peek();
	printf("The deleted value is %d", pqueue[index].val);
	int i;
	for( i = index; index<=rear; i++){
		pqueue[i].val = pqueue[i+1].val;
		pqueue[i].priority = pqueue[i+1].priority;		
	}
	rear--;
}

void display(){
	if (rear == -1) {
        printf("Queue is empty\n");
    } else {
        printf("Queue elements:\n");
        int i;
        for (i = 0; i <= rear; i++) {
            printf("Value: %d, Priority: %d\n", pqueue[i].val, pqueue[i].priority);
        }
    }
}


int main(){
	int choice, value, priority;

    while (1) {
        printf("\nMenu:\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Peek\n");
        printf("4. Display Queue\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                printf("Enter priority of the value: ");
                scanf("%d", &priority);
                enqueue(value, priority);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                if (rear == -1) {
                    printf("Queue is empty\n");
                } else {
                    int index = peek();
                    printf("Item with highest priority: %d with priority %d\n", pqueue[index].val, pqueue[index].priority);
                }
                break;
            case 4:
                display();
            case 5:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }

    return 0; 
}

