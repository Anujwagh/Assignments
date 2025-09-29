#include<iostream>
using namespace std;

class Cdate{
    int dd,mm,yy;
    public:
        void accept();
        void display();
        void setDd(int);
        int getMm();

};

void Cdate::accept()
{
    cout<<"accept day ,month and year\n";
    cin>>dd>>mm>>yy;

}
void Cdate::display()
{
    cout<<"date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;


}
void Cdate::setDd(int d)
{
   dd=d;

}
int Cdate::getMm()
{
   return mm;

}

int main()
{
    Cdate d1;
    d1.accept();
     d1.display();
    d1.setDd(23);
    cout<<"Update dte is 23"<<endl;
    d1.display();
    
    d1.getMm();


}





