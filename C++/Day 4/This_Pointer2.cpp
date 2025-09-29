#include <iostream>  
using namespace std; 


class Demo
{
	int a,b;
	public:
		Demo(int p,int q)
		{
			cout<<"address stored in this "<<this<<endl;
			this->a=p;
			this->b=q;
		}
		void display()
		{
			cout<<a;
			cout<<b;
		}
};
int main()
{
	Demo d(10,20);
	cout<<"address of d obj "<<&d<<endl;
}

/* The output of the program will show the same memory address twice. 
The first address is printed from inside the constructor using this, 
and the second is from main using &d. This proves that this
 inside the class's member functions is indeed pointing to the object itself.*/