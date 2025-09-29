#include<iostream>
using namespace std;
class A
{
int c;
public:
	int a=1;
protected:
	int b=2;
protected:
	void display()
	{
		cout<<"in display of A\n";
	}

};
class B:protected A
{
public:
	int d;
	public:
	void show()
	{
	    display();
		cout<<a<<b;
	
	}
};

int main()
{
    B bobj;
    bobj.show();
}