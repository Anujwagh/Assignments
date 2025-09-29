#include<iostream>
using namespace std;

// int main()
// {
//     int a=10;
//     int &a_new=a;

//     // cout<<a_new<<"\t"<<a;
//     cout<<&a_new<<"\t"<<&a<<"\n";
//     return 0;
// }

int main()
{
    int a=10,b=20;
    int &a_new=a;
    int &b_new=b;

    cout<<"display value :"<<a_new<<"\t"<<endl;
    a_new=100;

    cout<<"Update value :"<<a_new;

    // cout<<b_new<<"\t"<<b<<endl;
    // cout<<&a_new<<"\t"<<&b<<"\n";
    return 0;
}