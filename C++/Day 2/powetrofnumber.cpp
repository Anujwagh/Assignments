#include <iostream>
using namespace std;

int power(int base, int exponent) {
    int result = 1;
    for (int i = 1; i <= exponent; i++) {
        result *= base;
    }
    return result;
}

int main() {
    int base = 2, exponent = 3;
    int result = power(base, exponent);
    cout << base <<"^"<< exponent << "=" << result << endl;
    return 0;
}