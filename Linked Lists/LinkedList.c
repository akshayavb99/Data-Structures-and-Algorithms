#include<stdio.h>
#include<stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

int main()
{
  //Creating 3 nodes and allocating in the heap. Here head only stores address of first node, and has no data
  struct Node* head = (struct Node*)malloc(sizeof(struct Node));   
  struct Node* second = (struct Node*)malloc(sizeof(struct Node)); 
  struct Node* third = (struct Node*)malloc(sizeof(struct Node)); 
  
  //Initialization of data and next fields of head and the nodes
    
  head->next=second;
  head->data=1;
  
  second->data=2;
  second->next=third;
  
  thrid->data=3;
  thrid->next=NULL;
  return 0;
}
