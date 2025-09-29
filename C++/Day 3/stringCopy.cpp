#include <iostream>  
using namespace std; 
#include<string.h> 

int main()
{
    char str1[]="hello";
    char str2[50];
    strcpy(str2,str1);
    cout<<str2;
}