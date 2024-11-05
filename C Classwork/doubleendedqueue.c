#include <stdio.h>
#define MAX 5
int deque[MAX];
int front = -1;
int rear = -1;

void enqueuefront(int val) {
    if (front == 0) {
        printf("Overflow\n");
    } else if (front == -1 || rear == -1) {
        front = 0;
        rear = 0;
        deque[front] = val;
    } else {
        front = front - 1;
        deque[front] = val;
    }
}

void enqueuerear(int val) {
    if (rear == MAX - 1) {
        printf("Overflow\n");
    } else if (front == -1 || rear == -1) {
        front = 0;
        rear = 0;
        deque[rear] = val;
    } else {
        rear = rear + 1;
        deque[rear] = val;
    }
}

void dequeuefront() {
    if (front == -1) {
        printf("Underflow\n");
    } else if (front == rear) {
        printf("The deleted value is %d\n", deque[front]);
        front = -1;
        rear = -1;
    } else {
        printf("The deleted value is %d\n", deque[front]);
        front = front + 1;
    }
}

void dequeuerear() {
    if (front == -1) {
        printf("Underflow\n");
    } else if (front == rear) {
        printf("The deleted value is %d\n", deque[rear]);
        front = -1;
        rear = -1;
    } else {
        printf("The deleted value is %d\n", deque[rear]);
        rear = rear - 1;
    }
}

void display() {
    if (front == -1) {
        printf("Deque is empty\n");
    } else {
        printf("Deque elements are: ");
        int i; 
        for (i = front; i <= rear; i++) {
            printf("%d ", deque[i]);
        }
        printf("\n");
    }
}

int main() {
    int choice, value;
    while (1) {
        printf("\nChoose an operation:\n");
        printf("1. Enqueue Front\n");
        printf("2. Enqueue Rear\n");
        printf("3. Dequeue Front\n");
        printf("4. Dequeue Rear\n");
        printf("5. Display\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the value to enqueue at front: ");
                scanf("%d", &value);
                enqueuefront(value);
                break;
            case 2:
                printf("Enter the value to enqueue at rear: ");
                scanf("%d", &value);
                enqueuerear(value);
                break;
            case 3:
                dequeuefront();
                break;
            case 4:
                dequeuerear();
                break;
            case 5:
                display();
                break;
            case 6:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }
    return 0;
}

