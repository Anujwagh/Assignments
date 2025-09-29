#include<stdio.h>

int main()
{
    int a[5]={1,2,3,4,5};
    int *b=(a+4);
    int *c=(4+a);
    if(b==c)
    printf("both pointer pointing to same loc\n");
    if(*b==*c)
    printf("both pointer holding same value\n");
    if((*a+4)==*b)
    printf("both pointer holding same value\n");
}