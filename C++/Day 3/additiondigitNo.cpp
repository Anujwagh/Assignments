#include<iostream>
using namespace std;

int main()
{
    int num;
    cout<<"Enter number:";
    cin>>num;
    int rem1=num%10;
    num=num/10;

     int rem2=num%10;
    num=num/10;

     int rem3=num%10;
    num=num/10;

    cout<<rem1+rem2+rem3;
}


// int main()
// {
//     int num,sum=0;
//     cout<<"Enter Number: \n";
//     cin>>num;
//     while(num!=0)
//     {
//         int rem=num%10;
//         sum=sum+rem;
//         num=num/10;
//     }
//     cout<<sum;
// }