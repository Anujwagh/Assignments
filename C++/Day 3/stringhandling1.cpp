#include <iostream>  
using namespace std;  
#include<string.h>

int main()
{
    char str[50]="hello world";
    int len=strlen(str);

    cout<<"Length of string is "<<len<<endl;
    cout<<"Size of string is "<<sizeof(str)<<endl;
}

