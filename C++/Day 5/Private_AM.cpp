#include<iostream>
using namespace std;

class Circle{

    private:
        double radius;
    public:
        double compute_area()
        {
            return 3.14*radius*radius;
        }
};
int main()
{
    Circle c1;
    c1.radius=2.4;

    cout << "Radius is: " << c1.radius << "\n";
    cout << "Area is: " << c1.compute_area();
    return 0;

}