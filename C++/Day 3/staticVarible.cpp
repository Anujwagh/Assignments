#include<iostream>
using namespace std;

void show()
{
    static int x;
    cout<<x<<endl;
    x++;
}
int main()
{
    show();
    show();
    show();

}
