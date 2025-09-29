#include <iostream>  
using namespace std;
#include<string.h> 
int main()
{
    char str1[50]="hello";
    char str2[50]="bye";

    strcat(str1,str2);
    cout<<str1;
}

// void user_strcpy(char*,char*);
//  int main()
//  {
//     char str1[50];
//     char str2[50];
//     cout<<"Enter first string: "<<endl;
//     cin>>str1;
//     cout<<"Enter second string: "<<endl;
//     cin>>str2;
//     user_strcpy(str2,str1);
//     cout<<"Concatination of string : "<<str2;

//  }
//  void user_strcpy(char* s2,char* s1)
//  {
//     while(*s2!='\0')
//     {
//         s2++;
//     }
//     while(*s1!='\0')
//     {
//         *s2=*s1;
//         s1++;
//         s2++;
//     }
//  }