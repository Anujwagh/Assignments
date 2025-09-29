#include<iostream>
using namespace std;
class A
{
	int c;
public:
	int a=1;
protected:
	int b=2;
public:
	void display()
	{
		cout<<"in display of A\n";
	}

};
class B:public A
{
public:
		public:
	void show()
	{
	    display();
		cout<<a<<b<<"\n";
	}
};
class C:public B
{
	public:
	void show()
	{
		cout<< a<<b;
			}
};
int main()
{
	B bobj;
	bobj.show();
	bobj.display();
}