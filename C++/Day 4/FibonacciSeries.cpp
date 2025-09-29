#include<iostream>
using namespace std;

int main()
{
    int a=0,b=1,n=10;
    int nextTerm;

    cout<<a<<","<<b<<",";
    

    for(int i=1;i<=n;i++)
    {
        nextTerm=a+b;
        a=b;
        b=nextTerm;

        cout<<nextTerm<<",";
    }
     
    return 0;
}