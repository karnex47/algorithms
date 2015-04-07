#include "stdio.h"
#include "stdlib.h"
#ifndef NULL
#define NULL ((void*)0)
#endif

typedef struct Node node;

struct Node {
    int data;
    struct Node* next;
};

node* newNode() {
    node* ptr = (node*) malloc(sizeof(node));
    ptr->next = NULL;
    return ptr;
}

int main() {
    int arr[] = {1,2,3,4,5,7,8,1,4,90};

    node* root;
    node* conductor;
    root = newNode();
    conductor = root;
    int length = (sizeof(arr)/sizeof(*arr));
    int i;
    for(i = 0; i<length; i++) {
        conductor->data = arr[i];
        conductor->next = newNode();
        conductor = conductor->next;
    }
    // print the linked list
    conductor = root;
    printf("\n%d\n", root->data);
    while(conductor->next != NULL) {
        printf("%d\n", conductor->data);
        conductor = conductor->next;
    }
}
