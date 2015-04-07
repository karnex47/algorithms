#include "iostream"
#include "stdio.h"
#include "stdlib.h"

struct node {
    int data;
    node* left;
    node* right;
};

struct node* createNode(int data) {
    struct node* node = (struct node*)malloc(sizeof(struct node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
};

void b_insert(struct node* node, int data) {
    if(node == NULL) {
        node = createNode(data);
        return;
    }
    struct node* target;
    node->data < data?target = node->right:target = node->left;
    b_insert(target, data);
}

void printInorder (node* node)
{
    if (node == NULL)
        return;

    /* first recur on left child */
    printInorder (node->left);

    /* then print the data of node */
    printf("%d ", node->data);

    /* now recur on right child */
    printInorder (node->right);
}

int main() {
    struct node* root = NULL;
    int items[] = {5,3,6,7,1,9,4};
    int length = sizeof(items)/sizeof(*items);
    for(int i = 0; i<length; i++) {
        b_insert(root, items[i]);
    }

    printInorder(root);
    return 0;
}
