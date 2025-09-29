#include<iostream>
using namespace std;

// enum Day{sunday='A',monday,tuesday,wednesday,thursday,friday,saturday
// };

// int main() 
// { 
//     enum Day today;
//     today=monday;
//   	cout<<today;
//     switch (today) { 
//     case 65: 
//         cout << "it is sunday"; 
//         break; 
//     case 66: 
//         cout << "it is monday"; 
//         break; 
//     }
// }





enum Day{sunday=0,monday,tuesday,wednesday,thursday,friday,saturday
};
int main() 
{ 
    Day today=monday;
  
    switch (today) { 
    case sunday: 
        cout << "it is sunday"; 
        break; 
    case monday: 
        cout << "it is monday"; 
        break; 
}
}