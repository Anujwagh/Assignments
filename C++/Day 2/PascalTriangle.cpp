#include<iostream>
using namespace std;

int main()
{
    int n;

    cout << "Enter number of rows: ";
    cin >> n;

    for(int i=0;i<n;i++)
    {
        int c=1;
        for(int j=1;j<=i;j++)
        {
           
            c=c*(i-j)/(j+1);
             cout<<c<<" ";
        }
        cout<<endl;
    }
    return 0;

}