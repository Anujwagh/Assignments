#include <iostream>  
using namespace std;  
#include<string.h>

int main()
{
    char str[50]="hello world";
    char str1[]="hello \0 world";
    int len=strlen(str);

    cout<<"Length of string is "<<len<<endl;
    cout<<"Size of string is "<<sizeof(str)<<endl;

    cout<<str<<endl;
    cout<<str1<<endl;
    cout<<"Size of string is "<<sizeof(str1);
    // cout<<strlen(str);
}