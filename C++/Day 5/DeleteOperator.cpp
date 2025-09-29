#include<iostream>
using namespace std;

// int main()
// {
//     int* pointInt;
//     float* pointFloat;

//     pointInt=new int;
//     pointFloat=new float;

//     *pointInt = 45;
//     *pointFloat = 45.45f;
//     cout << *pointInt << endl;
//     cout << *pointFloat << endl;
//     int *p = new int(45);  
//     cout<<*p;

//     delete pointInt;
//     delete pointFloat;
//     delete p;
// }


// int main()
// {
// 	int* ptr=new int(10);
// 	cout<<*ptr;
// 	delete  ptr;
	
// }



// int main() {

//   int num;
//   cout << "Enter total number of students: ";
//   cin >> num;
//   float* ptr;
    

//   ptr = new float[num];

//   cout << "Enter GPA of students." << endl;
//   for (int i = 0; i < num; ++i) {
//     cout << "Student" << i + 1 << ": ";
//     cin >> *(ptr + i);
//   }

//   cout << "\nDisplaying GPA of students." << endl;
//   for (int i = 0; i < num; ++i) {
//     cout << "Student" << i + 1 << ": " << *(ptr + i) << endl;
//   }

//   delete[] ptr;

//   return 0;
// }




// Dynamic object creation on heap

class cdate
{
	int dd,mm,yy;
	public:
		cdate()
		{
			dd=mm=yy=0;
		}
		cdate(int d,int m,int y)
		{
			dd=d;
			mm=m;
			yy=y;
		}
		void show()
		{
			cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
		}
};
int main()
{
	cdate* ptr=new cdate();
	ptr->show();
	cdate* ptr1=new cdate(1,3,2025);
	ptr1->show();

}

