#include<iostream>
using namespace std;

class Complex{
    int real,img;
    public:
        Complex();
        Complex(int,int);
        void display() const;
        void setReal(int);
        int getReal() const;

};
void Complex::setReal(int r)
{
    real=r;
}
int Complex::getReal() const
{
    return real;
}
Complex::Complex()
{
      cout<<"In default constructor\n";
      real=1;
      img=2;
}
Complex::Complex(int r,int i)
{
    cout<<"In Parameter constructor\n";
      real=r;
      img=i;   
}
void Complex::display()const{
    cout<<"Complex number is "<<real<<"+"<<img<<"i"<<endl;
}
int main()
{
   const Complex c1(5,6);
   cout<<"real part\n"<<c1.getReal();
   Complex c2(3,4);
   c2.setReal(10);
    cout<<"real part "<<c2.getReal();
    

}