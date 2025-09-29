#include <iostream>
using namespace std;

namespace first_space
{
	int a=10;
  void func()
  {
     cout << "Inside first_space" << endl;
  }
}
 
namespace second_space
{
int a=100;
  void func()
  {
     cout << "Inside second_space" << endl;
  }
}
// using namespace first_space;
using namespace second_space;
int main ()
{
    func();
    cout<<a;
    return 0;
}








// #include<iostream>
// using namespace std;
//  namespace ns
// {
//     class geek
//     {
//     public:
//         void display()
//         {
//             cout<<"display()"<<endl;;
//         }
//     };
// }
 
// int main()
// {
//     ns::geek obj;
 
//     obj.display();
 
//     return 0;
// }