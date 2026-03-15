#include<bits\>
#include<stdio.h>
#include<stdlib.h>
// #include<conio.h>


struct node{
    int data;
    struct node *next;   
}

struct node *top=0;
int main()
{
    clrscr();
    push(2);
    push(3);
    push(6);
    display();
    peek();
    pop();
    peek();
    display();

    }


    void push(int x)
    {
        struct node *p;
        p=(struct node)malloc(sizeof(struct node));
        p->data=x;
        p->next=top;
        top=p;
    }


    void display()
    {
        struct node *temp;
        temp=top;
        if (top==NULL)
        {
            printf("empty stack");

        }

    else{
    while(temp!=NULL)
    {
        printf("%d",temp->data);
        temp=temp->next;
    }
}

    }





    void peek()
{
    if (top==NULL)
{
    printf("empty stack");

}

else{
    printf("top element is=%d",top->data);
}
}



void pop()
{
    struct node *temp;
    temp=top;
    if(top==NULL)
    {
        printf("empty stack");

    }

    else()
{
    printf("%d",top->data);
    top=top->next;
    free(temp);
}
}