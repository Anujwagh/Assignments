#include <iostream>
using namespace std;
class A {
public:
    int id_a;
};
class B {
public:
    int id_b;
};
class C : public B,public A{
    public:
        int id_c;
};
 int main()
{
    // B obj1;
    C obj2;
 
    // obj1.id_b = 7;
    // obj1.id_a = 91;
    obj2.id_b = 7;
    obj2.id_a = 91;
    obj2.id_c = 57;
    cout << "A id is: " << obj2.id_a << '\n';
    cout << "B id is: " << obj2.id_b << '\n';
    cout << "C id is: " << obj2.id_c << '\n';
    cout<<sizeof(obj2);
}
