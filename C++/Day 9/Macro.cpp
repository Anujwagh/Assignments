#include <iostream>  
#include<cmath>  
using namespace std;

#define MAXIMUM(a,b) (a>b)? a:b

int main()
{
    cout<<"MAX(100,1000): ";
    int k=MAXIMUM(100,1000);
    cout<<k<<endl;

    cout<<"MAX(30,0): ";
    int k1=MAXIMUM(30,0);
    cout<<k1;

    return 0;
}