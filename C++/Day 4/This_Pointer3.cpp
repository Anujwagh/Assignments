#include<iostream>
using namespace std;
class test
{
	int a,b;
	public:
	void show()
	{
		a=10;
		b=20;
	    cout<<"obj add :"<<this<<endl;
	    cout<<"a=" <<this->a<<endl;
	    cout<<"b="<<this->b<<endl;
    }
};
int main()
{
	test t;
	cout<<&t<<endl;
	t.show();
}

