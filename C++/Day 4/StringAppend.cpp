
#include <iostream>
using namespace std;

int main() {
    string str1("Hello World! ");
    string str2("Bye");

    str1.append(str2);

    cout << str1 << endl;

    return 0;
}