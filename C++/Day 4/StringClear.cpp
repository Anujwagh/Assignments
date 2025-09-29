#include <iostream>
#include <string.h>
using namespace std;

void clearDemo(string str)
{
    str.clear();

    cout << "After clear : ";
    cout << str;
}


int main()
{
    string str("Hello World!");

    cout << "Before clear : ";
    cout << str << endl;
    clearDemo(str);

    return 0;
}