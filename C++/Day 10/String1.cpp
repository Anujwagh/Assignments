#include <iostream>  
using namespace std;  
#include<string.h>

int main()
{
    char str1[20];
    char str2[20];
    cout<<"Enter first string :"<<endl;
    cin>>str1;
    cout<<"Enter second string :"<<endl;
    cin>>str2;
    int x=strcmp(str1,str2);
    if(x==1)
    cout<<"string 1 is greater than string 2"<<endl;
    if(x==-1)
     cout<<"string 2 is greater than string 1"<<endl;
    if(x==0)
     cout<<"string 1 is equal to string 2"<<endl;
}
