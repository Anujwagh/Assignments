#include <iostream>
using namespace std;
#include<stdlib.h>

class A
{
    int a;
    public:
        A()
        {
            cout<<"Default constructor was called"<<endl;
        }
        ~A()
        {
            cout<<"destructor was called"<<endl;
        }
};

int main()
{
    
    A* a = new A;
    cout << "Object of class A was created using new operator!"<<endl;
         
 
    delete a;
    cout << "Object of class A was deleted using delete keyword!"<< endl;
 
    cout << endl;
 
    A* b = (A*)malloc(sizeof(A));
    cout << "Object of class A was created using malloc()!"<< endl;
 
    free(b);
    cout << "Object of class A was deleted using free()!"<< endl;
 
    return 0;
}