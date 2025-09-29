#include <iostream>
using namespace std;

void pypart2(int n)
{
    
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<n-i;j++)
        {
            cout<<" ";
        }
        for(int k=0;k<i;k++){
            cout<<"* ";
        }
        cout<<endl;
    }
}

int main()
{
    int n;
    cout<<"Enter value:";
    cin>>n;
    pypart2(n);
    return 0;
}