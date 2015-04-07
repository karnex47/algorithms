#include "iostream"
using namespace std;

struct node
{
    int x;
    node *next;
};

int main ()
{
    int N = 1000;
    int hop = 40;
    int i;
    node *root;
    node *conductor;
    root = new node;
    conductor = root;

    // Create a circular list of N nodes
    for(i=1; i<=N; i++)
    {
        conductor->x = i;
        conductor->next = new node;
        conductor = conductor->next;
    }
    conductor->next = root;

    // Delete node at hop on n
    node *prev;
    node *temp;
    prev = conductor;
    conductor = root;
    int delCount = 0;

    while(conductor->next != prev)
    {
        for (i = 1; i<hop; i++)
        {
            prev = conductor;
            conductor = conductor->next;
        }
        // If the node->next points to itself, then break
        temp = conductor;
        prev->next = conductor->next;
        conductor = conductor->next;
        std::cout<<"Deleting node: "<<temp->x<<endl;
        delCount++;
        delete temp;
    }
    std::cout<<endl<<"Deleted nodes: "<<delCount<<endl;
    return 0;
}
